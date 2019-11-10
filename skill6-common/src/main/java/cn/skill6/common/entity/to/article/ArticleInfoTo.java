package cn.skill6.common.entity.to.article;

import cn.skill6.common.entity.to.intf.BaseTemplate;
import org.springframework.stereotype.Service;

/**
 * 增加数据库实体类的字段模板类,返回该字段对应的下划线格式
 *
 * @author 何明胜
 * @since 2018年9月22日 上午11:55:06
 */
@Service
public class ArticleInfoTo implements BaseTemplate {

    public String getArticleUpdateTime() {
        return null;
    }

    public String getCategoryId() {
        return null;
    }

    public String getArticleId() {
        return null;
    }

    public String getArticleTitle() {
        return null;
    }

    public String getArticleAuthor() {
        return null;
    }

    public String getArticleSummary() {
        return null;
    }

    public String getArticleLabel() {
        return null;
    }

    public String getArticleReadTotal() {
        return null;
    }

    public String getArticleCreateTime() {
        return null;
    }

    public Boolean getArticlePlaceTop() {
        return null;
    }

    public Integer getArticleTopPriority() {
        return null;
    }

    public Boolean getArticleAttachFile() {
        return null;
    }

    public Boolean getArticleValid() {
        return null;
    }

    public String getArticleHtmlContent() {
        return null;
    }

    public String getArticleMdContent() {
        return null;
    }

    public String getArticleAttachIds() {
        return null;
    }

    public boolean judgeFieldIsExist(String aimFieldName) {
        return judgeFieldIsExist(this.getClass(), aimFieldName);
    }
}
