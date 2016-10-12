package com.zhongtai.hibernate_demo.service;

import org.hibernate.Transaction;

import com.zhongtai.hibernate_demo.common.HibernateSessionFactory;
import com.zhongtai.hibernate_demo.dao.UserDao;
import com.zhongtai.hibernate_demo.po.User;

public class UserService {

	private UserDao userDao = new UserDao();
	
	public void addNewuser(User user){
		Transaction tx = null;
		
		try {
			tx = HibernateSessionFactory.getSession().beginTransaction();
			userDao.save(user);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx !=null) {
				tx.rollback();
			}
		}
		
	}
	
	
}
