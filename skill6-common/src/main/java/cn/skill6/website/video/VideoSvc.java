package cn.skill6.website.video;

import cn.skill6.common.entity.po.video.VideoInfo;

import java.util.List;

/**
 * 视频接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:54
 */
public interface VideoSvc {
    List<VideoInfo> getVideosByPage(int pageSize, int pageNum);

    VideoInfo getVideoById(Long videoId);
}
