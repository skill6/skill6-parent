package cn.skill6.website.home;

import cn.skill6.common.entity.po.article.ArticleInfo;
import cn.skill6.common.entity.vo.ResponseJson;

import java.util.List;

/**
 * 首页推荐接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:47
 */
public interface RecommendSvc {
    /**
     * @return 推荐轮播内容
     */
    ResponseJson getRecommendCarousel();

    /**
     * @return 推荐视频内容
     */
    ResponseJson getRecommendVideo();

    /**
     * @return 推荐下载内容
     */
    ResponseJson getRecommendDownload();

    /**
     * @return 推荐提问答疑
     */
    ResponseJson getRecommendQuestion();

    /**
     * @return 推荐文章
     */
    List<ArticleInfo> getRecommendArticle();
}
