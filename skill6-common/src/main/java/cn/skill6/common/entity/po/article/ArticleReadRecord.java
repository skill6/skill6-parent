package cn.skill6.common.entity.po.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文章阅读记录实体类
 *
 * @author 何明胜
 * @since 2018年8月15日 下午11:30:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleReadRecord {
    private Long articleId;

    private Date articleDateDaily;

    private Integer articleReadDaily;
}
