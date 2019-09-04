package cn.skill6.website.basic;

import cn.skill6.common.entity.vo.ResponseJson;

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
    ResponseJson getNotice();
}
