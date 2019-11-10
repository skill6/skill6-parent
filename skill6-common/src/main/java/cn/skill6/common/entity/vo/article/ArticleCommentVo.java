package cn.skill6.common.entity.vo.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 文章评论及回复类
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-11-10 14:30
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleCommentVo {
    private String commentId;

    private long articleId;

    private Date commentTime;

    /**
     * 评论者ID
     */
    private long commentUserId;

    /**
     * 评论者昵称
     */
    private String commentUserNickName;

    private String commentUserHeadUrl;

    /**
     * 点赞数量
     */
    private int commentThumbsUpCount;

    private String commentContent;

    private List<ArticleCommentReplyVo> articleCommentReplyVos;
}
