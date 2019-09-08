package cn.skill6.website.video;

import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 视频接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:54
 */
public interface VideoSvc {
    ResponseJson getVideosByPage(int pageSize, int pageNum);

    ResponseJson getVideoById(Long videoId);
}
