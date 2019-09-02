package cn.skill6.common.entity.po.article;

import lombok.AllArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCommentReply {
    private Long replyId;

    private Long commentId;

    private Long replyUserId;

    private Long replyToUserId;

    private Date replyTime;

    private Boolean replyValid;

    private String replyContent;
}