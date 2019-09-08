package cn.skill6.website.infoflow;

import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 信息流
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:43
 */
public interface InfoFlowSvc {
    ResponseJson getLatestUpdate();

    ResponseJson getMostBrowse();

    ResponseJson getMostReply();
}

