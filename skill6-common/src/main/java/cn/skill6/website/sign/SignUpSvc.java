package cn.skill6.website.sign;

import cn.skill6.common.entity.po.user.UserInfo;

/**
 * 注册服务
 *
 * @author 何明胜
 * @since 2018年11月23日 下午10:22:59
 */
public interface SignUpSvc {
    /**
     * 创建用户
     *
     * @param userInfo 用户信息
     * @return 创建结果
     */
    String createUser(UserInfo userInfo);

    /**
     * 快速创建用户
     *
     * @param userPrivacyInfo 用户信息
     * @return 用户id
     */
    long quickCreateUser(UserInfo userPrivacyInfo);

}
