package cn.skill6.website.article;

import cn.skill6.common.entity.po.article.ArticleInfo;
import cn.skill6.common.entity.vo.PageResult;
import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.common.exception.Skill6Exception;

import java.util.List;

/**
 * 微服务接口
 *
 * @author 何明胜
 * @since 2018年9月4日 上午1:00:40
 */
public interface ArticleSvc {
    /**
     * 添加新文章
     *
     * @param articleInfo 文章信息
     * @return 添加结果
     */
    long addArticle(ArticleInfo articleInfo);

    /**
     * 根据id删除文章
     *
     * @param articleId 文章ID
     * @return 删除结果
     */
    int deleteArticleById(Long articleId);

    /**
     * 根据id修改文章
     *
     * @param articleInfo 文章信息
     * @return 修改结果
     */
    ResponseJson modifyArticleById(ArticleInfo articleInfo);

    /**
     * 根据id获取文章
     *
     * @param articleId 文章ID
     * @return 查询结果
     * @throws Skill6Exception 基本异常
     */
    ArticleInfo getArticleById(Long articleId);

    /**
     * @return 所有文章
     */
    List<ArticleInfo> getAllArticles();

    /**
     * 分页查询文章
     *
     * @param pageSize 分页大小
     * @param pageNum  页码
     * @return 查询结果
     */
    public PageResult<ArticleInfo> getArticlesByPage(int pageSize, int pageNum);
}
