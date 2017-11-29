package com.base.service;

import com.base.pojo.User;

/**
 * 用户业务
 *
 * ClassName: UserService
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
public interface UserService {

    /**
     * 根据ID查询用户
     * @Description: TODO
     * @param @param userId
     * @param @return
     * @return UserService
     * @throws
     * @author yokoboy
     * @date 2017年11月29日
     */
	User getUserById(int userId);
}
