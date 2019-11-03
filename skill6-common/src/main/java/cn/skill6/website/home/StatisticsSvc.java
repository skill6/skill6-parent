package cn.skill6.website.home;

import cn.skill6.common.entity.po.visit.VisitStatistics;

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
    VisitStatistics getStatisticsVisit();

    /**
     * @return 在线统计
     */
    int getStatisticsOnline();
}
