package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * 登录方式枚举, 设置长度不超过8
 *
 * @author 何明胜
 * @version 1.3
 * @since 2018年5月14日 下午5:06:55
 */
@AllArgsConstructor
public enum LoginType implements BaseEnum<Enum<LoginType>> {

    /**
     * 用户名登录
     */
    USERNAME("/login/username"),

    /**
     * "邮箱登录
     */
    EMAIL("/login/email"),

    /**
     * 手机登录
     */
    PHONE("/login/phone"),

    /**
     * github登录
     */
    GITHUB("/login/github"),

    /**
     * google登录
     */
    GOOGLE("/login/google"),

    /**
     * qq登录
     */
    QQ("/login/qq"),

    /**
     * 微信登录
     */
    WECHAT("/login/wechat");

    @Getter
    private String uri;

    @Override
    public String getEnumName() {
        return StringUtils.lowerCase(name(), Locale.SIMPLIFIED_CHINESE);
    }

    public static LoginType getEnum(String enumName) {
        return valueOf(StringUtils.upperCase(enumName, Locale.SIMPLIFIED_CHINESE));
    }
}
