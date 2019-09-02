package cn.skill6.common.entity.po.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 系统通知
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 01:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private Long noticeId;

    private Date noticeTime;

    private String noticeContent;
}