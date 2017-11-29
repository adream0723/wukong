package com.base.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.base.pojo.User;
import com.base.service.UserService;

/**
 * mybatis测试
 *
 * ClassName: TestMybatis
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MybatisTest {
	private static Logger logger = Logger.getLogger(MybatisTest.class);

	@Resource
	private UserService userService;

	@Test
	public void mybatisTest() {
		User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
	}
}
