package cn.skill6.common.entity.po.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文章评论回复
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 01:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCommentReply {
    private Long replyId;

    /**
     * 回复的评论对应的ID
     */
    private Long commentId;

    /**
     * 回复者ID
     */
    private Long replyUserId;

    /**
     * 被回复者ID
     */
    private Long replyToUserId;

    private Date replyTime;

    private Boolean replyValid;

    private String replyContent;
}