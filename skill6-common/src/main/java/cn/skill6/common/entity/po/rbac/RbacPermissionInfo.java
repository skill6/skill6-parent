package cn.skill6.common.entity.po.rbac;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * RBAC权限信息
 *
 * @author 何明胜
 * @since 2018年9月23日 下午5:52:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RbacPermissionInfo {
    private Long permissionId;

    private String permissionName;

    private String permissionCode;

    private String permissionDesc;

    private Boolean permissionNavi;

    private String permissionUrl;

    private Date permissionCreateTime;

    private Date permissionUpdateTime;

    private Boolean permissionValid;
}
