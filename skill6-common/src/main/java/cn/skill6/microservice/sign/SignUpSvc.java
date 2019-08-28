package cn.skill6.microservice.sign;

import cn.skill6.common.entity.po.user.UserPrivacyInfo;

/**
 * 注册服务
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年11月23日 下午10:22:59
 */
public interface SignUpSvc {

    String createUser(UserPrivacyInfo userPrivacyInfo);

}
