package cn.skill6.common.entity.po.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文章评论实体类
 *
 * @author 何明胜
 * @since 2018年8月15日 下午11:29:03
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleComment {
    private Long commentId;

    private Long articleId;

    /**
     * 文章所属的用户
     */
    private Long userId;

    /**
     * 评论的用户
     */
    private Long commentUserId;

    private Integer commentThumbsUpCount;

    private Date commentTime;

    private Boolean commentValid;

    private String commentContent;
}
