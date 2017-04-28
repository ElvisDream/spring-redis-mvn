package com.company.repository;

import com.company.bean.UserInfo;

/**
 * Created by Elivs on 2017/4/28.
 */
public interface UserInfoRepository {

    /**
     * 添加一个用户
     * @param userInfo
     */
    void saveUserInfo(UserInfo userInfo);

    /**
     * 根据name查询用户
     * @param userName
     * @return
     */
    UserInfo getUserInfoByName(String userName);

    /**
     * 修改一个用户
     * @param userInfo
     */
    void updateUserInfo(UserInfo userInfo);

    /**
     * 删除一个用户
     * @param name
     */
    void deleteUserInfo(String name);
}
