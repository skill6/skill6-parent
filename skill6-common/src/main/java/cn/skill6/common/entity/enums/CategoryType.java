package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * 目录类型枚举，如文章、下载等, 长度不超过16
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年9月2日 下午7:20:58
 */
public enum CategoryType implements BaseEnum<Enum<CategoryType>> {

    /**
     * 目录类型为文章
     */
    ARTICLE,

    /**
     * 讨论区
     */
    DISCUSS_AREA,

    /**
     * 文章下载
     */
    FILE_DOWNLOAD;

    @Override
    public String getEnumName() {
        return StringUtils.lowerCase(name(), Locale.SIMPLIFIED_CHINESE);
    }

    public static CategoryType getEnum(String enumName) {
        return valueOf(StringUtils.upperCase(enumName, Locale.SIMPLIFIED_CHINESE));
    }

}
