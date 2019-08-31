package cn.skill6.common.entity.po.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户信息修改记录实体类
 *
 * @author 何明胜
 * @since 2018年8月15日 下午11:37:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModifyRecord {
    private Long userId;

    private String userModifyType;

    private Date userModifyTime;

    private String userModifyBefore;

    private String userModifyAfter;

    private Boolean userModifyResult;
}
