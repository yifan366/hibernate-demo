package com.zhongtai.hibernate_demo.common;

import javax.management.RuntimeErrorException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

	private static Configuration configuration;
	
	private static SessionFactory sessionFactory;
	
	static{
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			
			throw new RuntimeException("Hibernate 初始化失败",e);
		}
	}
	
	/**
	 * 获取session
	 * @return
	 */
	public static Session getSession(){
		
		return sessionFactory.getCurrentSession();
	}
}
