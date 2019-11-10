package cn.skill6.common.entity.vo.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文章信息
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-11-10 23:20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleInfoVo {
    private String articleId;

    private String categoryId;

    private String articleTitle;

    private String articleAuthor;

    private String articleSummary;

    private String articleLabel;

    private int articleReadTotal;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private boolean articlePlaceTop;

    private int articleTopPriority;

    private boolean articleAttachFile;

    private String articleAttachIds;

    private boolean articleValid;

    private String articleHtmlContent;

    private String articleMdContent;

    private String userHeadUrl;
}
