package cn.skill6.common.entity.vo.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 评论回复列表
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-11-10 14:52
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCommentReplyVo {
    private String replyId;

    /**
     * 回复的评论对应的ID
     */
    private long commentId;

    /**
     * 回复者ID
     */
    private long replyUserId;

    /**
     * 回复者昵称
     */
    private String replyUserNickName;

    private String replyUserHeadUrl;

    /**
     * 被回复者ID
     */
    private long replyToUserId;

    /**
     * 被回复者昵称
     */
    private String replyToUserNickName;

    private String replyToUserHeadUrl;

    private Date replyTime;

    private String replyContent;
}
