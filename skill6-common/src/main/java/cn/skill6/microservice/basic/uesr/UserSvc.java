package cn.skill6.microservice.basic.uesr;

import cn.skill6.common.entity.po.user.UserInfo;

/**
 * 用户隐私信息服务接口
 *
 * @author 何明胜
 * @version 1.0
 * @since 2018年11月22日 上午12:48:00
 */
public interface UserSvc {

    /**
     * 快速创建用户
     *
     * @param userPrivacyInfo 用户信息
     * @return 用户id
     */
    Long quickCreateUser(UserInfo userPrivacyInfo);
}
