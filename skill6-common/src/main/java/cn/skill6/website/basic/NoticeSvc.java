package cn.skill6.website.basic;

import cn.skill6.common.entity.po.other.Notice;

import java.util.List;

/**
 * 通知接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:43
 */
public interface NoticeSvc {
    /**
     * 查询通知
     *
     * @return 查询结果
     */
    Notice getNotice();

    /**
     * 查询最新发布的通知
     *
     * @param topn 查询的数量
     * @return 返回最近的n条通知
     */
    List<Notice> getLatestNotice(int topn);
}
