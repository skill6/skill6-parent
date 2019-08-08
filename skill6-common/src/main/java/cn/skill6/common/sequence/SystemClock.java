package cn.skill6.common.sequence;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.sql.Timestamp;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 高并发场景下System.currentTimeMillis()的性能问题的优化
 *
 * <p>System.currentTimeMillis()的调用比new一个普通对象要耗时的多（具体耗时高出多少我还没测试过,有人说是100倍左右）
 *
 * <p>System.currentTimeMillis()之所以慢是因为去跟系统打了一次交道
 *
 * <p>后台定时更新时钟,JVM退出时,线程自动回收
 *
 * <p>10亿：43410,206,210.72815533980582%
 *
 * <p>1亿：4699,29,162.0344827586207%
 *
 * <p>1000万：480,12,40.0%
 *
 * <p>100万：50,10,5.0%
 *
 * @author 何明胜
 * @version 1.1
 * @since 2018年4月16日 下午9:48:21
 */
public class SystemClock {

    private final AtomicLong now;

    private SystemClock(long period) {
        this.now = new AtomicLong(System.currentTimeMillis());
        scheduleClockUpdating();
    }

    private static class InstanceHolder {
        public static final SystemClock INSTANCE = new SystemClock(1);
    }

    private static SystemClock instance() {
        return InstanceHolder.INSTANCE;
    }

    private void scheduleClockUpdating() {
        ThreadFactory namedThreadFactory =
                new ThreadFactoryBuilder().setNameFormat("system-clock-%d").build();
        // Common Thread Pool
        ExecutorService pool =
                new ThreadPoolExecutor(
                        5,
                        200,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>(1024),
                        namedThreadFactory,
                        new ThreadPoolExecutor.AbortPolicy());
        pool.execute(() -> now.set(System.currentTimeMillis()));
        // gracefully shutdown
        pool.shutdown();
    }

    private long currentTimeMillis() {
        return now.get();
    }

    public static long now() {
        return instance().currentTimeMillis();
    }

    public static String nowDate() {
        return new Timestamp(instance().currentTimeMillis()).toString();
    }
}
