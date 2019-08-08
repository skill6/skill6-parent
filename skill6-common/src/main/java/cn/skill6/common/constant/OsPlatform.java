package cn.skill6.common.constant;

import cn.skill6.common.exception.general.ParamsException;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 操作系统平台
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年9月2日 下午11:51:33
 */
public enum OsPlatform {
    WINDOWS("Windows"),
    LINUX("Linux"),
    MAC("Mac");

    private String osName;

    private OsPlatform(String osName) {
        this.osName = osName;
    }

    /**
     * @return the osName
     */
    public String getOsName() {
        return osName;
    }

    /**
     * @param osName the osName to set
     */
    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * @return 当前操作系统
     */
    public static OsPlatform getCurrentOs() {
        String currOsName = System.getProperty("os.name");

        return Arrays.stream(OsPlatform.values()).filter(osPlatform -> StringUtils.equals(osPlatform.getOsName(),
                currOsName)).findFirst().orElseThrow(ParamsException::new);
    }
}
