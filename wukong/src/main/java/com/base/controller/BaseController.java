package com.base.controller;

import javax.annotation.Resource;

import com.base.service.UserService;

/**
 * 基本类
 *
 * ClassName: BaseController
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
public class BaseController {

	@Resource
	protected UserService userService;
}
