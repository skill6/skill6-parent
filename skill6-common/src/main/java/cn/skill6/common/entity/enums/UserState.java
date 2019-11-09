package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * 状态枚举, 长度不超过16
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年10月23日 上午1:19:52
 */
public enum UserState implements BaseEnum<Enum<UserState>> {

    /**
     * 用户有效状态
     */
    VALID,

    /**
     * 用户锁定状态
     */
    LOCKED,

    /**
     * 用户注销状态
     */
    INVALID;

    @Override
    public String getEnumName() {
        return StringUtils.lowerCase(name(), Locale.SIMPLIFIED_CHINESE);
    }

    public static UserState getEnum(String enumName) {
        return valueOf(StringUtils.upperCase(enumName, Locale.SIMPLIFIED_CHINESE));
    }
}
