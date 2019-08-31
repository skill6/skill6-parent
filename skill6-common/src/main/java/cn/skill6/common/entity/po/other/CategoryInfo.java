package cn.skill6.common.entity.po.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 目录分类实体类
 *
 * @author 何明胜
 * @since 2018年8月15日 下午11:31:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryInfo {
    private Long categoryId;

    private String categoryName;

    private String categoryType;

    private Date categoryCreateTime;

    private Date categoryUpdateTime;

    private Boolean categoryValid;
}
