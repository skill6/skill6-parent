package cn.skill6.common.entity.po.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 第三方授权实体类
 *
 * @author 何明胜
 * @since 2018年11月1日 下午11:29:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThirdpartyAuth {
    private Long thirdpartyId;

    private Long userId;

    private String thirdpartyPrimaryKey;

    private Boolean thirdpartyValid;

    private Date thirdpartyCreateTime;

    private String thirdpartyData;
}
