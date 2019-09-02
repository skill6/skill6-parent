package cn.skill6.common.entity.po.video;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 视频教程信息
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 02:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoInfo {
    private Long videoId;

    private Long videoPosterId;

    private String videoName;

    private Date videoCreateTime;

    private Date videoUpdateTime;

    private String videoDesc;
}
