package cn.skill6.website.article;

import cn.skill6.common.entity.po.article.ArticleComment;
import cn.skill6.common.entity.po.article.ArticleCommentReply;
import cn.skill6.common.entity.vo.PageResult;

/**
 * 评论
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:26
 */
public interface CommentSvc {
    /**
     * 获取分页的文章评论
     *
     * @param pageSize 分页大小
     * @param pageNum  页码
     * @return 查询结果
     */
    PageResult<ArticleComment> getCommentsByPage(int pageSize, int pageNum);

    /**
     * 根据评论ID获取评论内容
     *
     * @param commentId 评论ID
     * @return 评论内容
     */
    ArticleComment getCommentById(long commentId);

    /**
     * 增加评论
     *
     * @param articleComment 评论内容
     * @return 评论ID
     */
    long addArticleComment(ArticleComment articleComment);

    long addArticleCommentReply(ArticleCommentReply articleCommentReply);
}
