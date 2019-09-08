package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import cn.skill6.common.exception.general.ParamsException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 排序枚举
 *
 * @author 何明胜
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

    @Getter
    private String value;

    @Override
    public String getEnumName() {
        return value;
    }

    public static SortType getEnum(String value) {
        return Arrays.stream(SortType.values()).filter(sortType -> StringUtils.equals(sortType.getEnumName(), value)).
                findFirst().orElseThrow(ParamsException::new);
    }
}
