package cn.skill6.website.home;

import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 统计接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:58
 */
public interface StatisticsSvc {
    /**
     * @return 访问统计
     */
    ResponseJson getStatisticsVisit();

    /**
     * @return 在线统计
     */
    ResponseJson getStatisticsOnline();
}
