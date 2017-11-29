package com.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.base.pojo.User;

/**
 * 页面跳转
 *
 * ClassName: PageController
 * @Description: TODO
 * @author yokoboy
 * @date 2017年11月29日
 */
@Controller
@RequestMapping("/page")
public class PageController extends BaseController {

    /**
     * 登录
     */
	private final String forWardLogin = "login";
	/**
	 * 首页
	 */
	private final String forWardHome = "home";
	/**
	 * 测试
	 */
	private final String forWardShowUser = "show_user";

	/**
	 * 跳转登录
	 * @Description: TODO
	 * @param @return
	 * @return PageController
	 * @throws
	 * @author yokoboy
	 * @date 2017年11月29日
	 */
	@RequestMapping(value = "/login.do")
	public String login() {
		return forWardLogin;
	}

	/**
	 * 跳转首页
	 * @Description: TODO
	 * @param @return
	 * @return PageController
	 * @throws
	 * @author yokoboy
	 * @date 2017年11月29日
	 */
	@RequestMapping(value = "/home.do")
	public String home() {
		return forWardHome;
	}

	/**
	 * 测试
	 * @Description: TODO
	 * @param @param request
	 * @param @param model
	 * @param @return
	 * @return PageController
	 * @throws
	 * @author yokoboy
	 * @date 2017年11月29日
	 */
	@RequestMapping(value = "/showUser.do")
	public String showUser(HttpServletRequest request, Model model) {
		User user = this.userService.getUserById(Integer.parseInt(request.getParameter("id")));
		model.addAttribute("user", JSON.toJSONString(user));
		return forWardShowUser;
	}
}
