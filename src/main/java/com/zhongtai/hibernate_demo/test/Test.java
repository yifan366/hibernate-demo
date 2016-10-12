package com.zhongtai.hibernate_demo.test;

import com.zhongtai.hibernate_demo.po.User;
import com.zhongtai.hibernate_demo.service.UserService;

public class Test {

	public static void main(String[] args) {
		
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("123456");
		
		UserService userService = new UserService();
		
		userService.addNewuser(user);
	}
}
