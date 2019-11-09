package cn.skill6.website.video;

import cn.skill6.common.entity.po.video.VideoInfo;
import cn.skill6.common.entity.vo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 视频接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:54
 */
public interface VideoSvc {
    PageResult<VideoInfo> getVideosByPage(int pageSize, int pageNum);

    VideoInfo getVideoById(Long videoId);

    long addVideo(@RequestBody VideoInfo videoInfo);
}
