package cn.skill6.common.entity.po.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文章历史版本实体类
 *
 * @author 何明胜
 * @since 2018年8月28日 上午1:25:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleModifyRecord {
    private Long articleModifyId;

    private Long articleId;

    private Long categoryId;

    private String articleTitle;

    private String articleAuthor;

    private String articleSummary;

    private String articleLabel;

    private Integer articleReadTotal;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private Boolean articlePlaceTop;

    private Integer articleTopPriority;

    private Boolean articleAttachFile;

    private String articleHtmlContent;

    private String articleMdContent;

    private String articleAttachIds;
}
