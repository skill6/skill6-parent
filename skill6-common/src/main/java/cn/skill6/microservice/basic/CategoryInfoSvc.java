package cn.skill6.microservice.basic;

import cn.skill6.common.entity.po.other.CategoryInfo;
import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 信息目录服务接口
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年10月5日 下午4:10:03
 */
public interface CategoryInfoSvc {
    /**
     * 增加目录信息
     *
     * @param featureCategoryInfo
     * @param categoryType
     * @return 操作结果
     */
    public ResponseJson addCategoryInfo(CategoryInfo featureCategoryInfo, int categoryType);

    /**
     * 增加目录信息
     *
     * @param featureCategoryInfo
     * @return 操作结果
     */
    ResponseJson addCategoryInfo(CategoryInfo featureCategoryInfo);
}
