package com.zhongtai.hibernate_demo.dao;

import com.zhongtai.hibernate_demo.common.HibernateSessionFactory;
import com.zhongtai.hibernate_demo.po.User;

public class UserDao {

	public void save(User user){
		
		HibernateSessionFactory.getSession().save(user);
	}
	
}
