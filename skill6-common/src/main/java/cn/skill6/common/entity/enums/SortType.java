package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import cn.skill6.common.exception.general.ParamsException;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 排序枚举
 *
 * @author 何明胜
 * @version 1.1
 * @since 2018年9月21日 下午10:34:15
 */
@AllArgsConstructor
public enum SortType implements BaseEnum<Enum<SortType>> {

    /**
     * 升序排列
     */
    ASCENDING("ASC"),

    /**
     * "降序排列
     */
    DESCENDING("DESC");

    private String value;

    @Override
    public String getEnumName() {
        return StringUtils.lowerCase(name());
    }

    public static SortType getEnum(String enumName) {
        return Arrays.stream(SortType.values()).filter(sortType -> StringUtils.equals(sortType.getEnumName(),
                enumName)).findFirst().orElseThrow(ParamsException::new);
    }

}
