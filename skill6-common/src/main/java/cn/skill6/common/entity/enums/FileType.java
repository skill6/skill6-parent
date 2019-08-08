package cn.skill6.common.entity.enums;

import cn.skill6.common.entity.enums.intf.BaseEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * 文件类型枚举，是文章附件还是分享的软件等, 长度不超过16
 *
 * @author 何明胜
 * @version 1.2
 * @since 2018年9月4日 下午11:36:18
 */
public enum FileType implements BaseEnum<Enum<FileType>> {

    /**
     * 附件文件
     */
    ATTACHMENT,

    /**
     * 分享提供下载
     */
    SHARE_FILES;

    @Override
    public String getEnumName() {
        return StringUtils.lowerCase(name());
    }

    public static FileType getEnum(String enumName) {
        return valueOf(StringUtils.upperCase(enumName));
    }
}
