package com.company.repository.impl;

import com.company.bean.UserInfo;
import com.company.repository.UserInfoRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Elivs on 2017/4/28.
 */
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

    @Resource
    private RedisTemplate<String, UserInfo> redisTemplate;

    @Override
    public void saveUserInfo(UserInfo userInfo) {

        System.out.println(userInfo);

        redisTemplate.opsForValue().set(userInfo.getUserName(), userInfo);
    }

    @Override
    public UserInfo getUserInfoByName(String userName) {

        System.out.println(userName);

        return redisTemplate.opsForValue().get(userName);
    }


    @Override
    public void updateUserInfo(UserInfo userInfo) {

        redisTemplate.opsForValue().set(userInfo.getUserName(), userInfo);
    }

    @CacheEvict(value = "default",key = "#userName")//清空name=userName的对象
    @Override
    public void deleteUserInfo(String name) {

        redisTemplate.opsForValue().getOperations().delete(name);
    }
}
