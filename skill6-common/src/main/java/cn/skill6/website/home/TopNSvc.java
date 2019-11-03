package cn.skill6.website.home;

import cn.skill6.common.entity.po.article.ArticleInfo;
import cn.skill6.common.entity.po.user.UserInfo;

import java.util.List;

/**
 * top n 接口接口定义
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 01:00
 */
public interface TopNSvc {
    /**
     * @return top n 活跃用户列表
     */
    List<UserInfo> getActiveUsers();

    /**
     * @return top n 访问量用户列表
     */
    List<UserInfo> getTrafficUsers();

    /**
     * @return top n 最新发表文章列表
     */
    List<ArticleInfo> getPublishArticles();
}
