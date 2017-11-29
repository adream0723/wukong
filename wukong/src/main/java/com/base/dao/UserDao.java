package com.base.dao;

import com.base.pojo.User;

/**
 * 用户数据库操作
 *
 * ClassName: UserDao
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
public interface UserDao {

    /**
     * 根据ID查询用户
     * @Description: TODO
     * @param @param record
     * @param userId
     * @return UserDao
     * @throws
     * @author yokoboy
     * @date 2017年11月29日
     */
	User selectByPrimaryKey(int userId);
}