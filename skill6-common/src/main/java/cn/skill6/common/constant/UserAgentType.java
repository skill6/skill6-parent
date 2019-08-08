package cn.skill6.common.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * 用户访问设备类型
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年12月30日 下午11:32:34
 */
public enum UserAgentType {
    PC,
    MOBILE;

    public String getEnumName() {
        return StringUtils.lowerCase(name());
    }

    public static UserAgentType getEnum(String enumName) {
        return valueOf(StringUtils.upperCase(enumName));
    }

}
