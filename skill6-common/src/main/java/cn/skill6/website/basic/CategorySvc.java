package cn.skill6.website.basic;

import cn.skill6.common.entity.po.other.CategoryInfo;
import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 信息目录服务接口
 *
 * @author 何明胜
 * @since 2018年10月5日 下午4:10:03
 */
public interface CategorySvc {
    /**
     * 增加目录信息
     *
     * @param categoryInfo 目录内容
     * @param categoryType 目录分类
     * @return 操作结果
     */
    ResponseJson addCategory(CategoryInfo categoryInfo, int categoryType);

    /**
     * 增加目录信息
     *
     * @param categoryInfo 目录内容
     * @return 操作结果
     */
    ResponseJson addCategory(CategoryInfo categoryInfo);
}
