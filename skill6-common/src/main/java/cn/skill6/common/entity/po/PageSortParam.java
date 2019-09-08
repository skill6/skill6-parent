package cn.skill6.common.entity.po;

import cn.skill6.common.entity.enums.SortType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 查询数据库的分页和排序
 *
 * @author 何明胜
 * @since 2018年9月21日 下午10:31:26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSortParam {

    private int pageSize;

    /**
     * 从1开始
     */
    private int pageNum;

    private String orderBy;

    private SortType sortType;

    public String orderBy() {
        if (StringUtils.isEmpty(orderBy)) {
            return StringUtils.EMPTY;
        }
        if (sortType == null) {
            return orderBy;
        }

        return orderBy + StringUtils.SPACE + sortType.getEnumName();
    }
}
