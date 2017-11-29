package com.base.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.dao.UserDao;
import com.base.pojo.User;
import com.base.service.UserService;

/**
 * 用户业务实现类
 *
 * ClassName: UserServiceImpl
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
