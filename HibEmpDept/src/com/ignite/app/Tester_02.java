package com.ignite.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ignite.beans.Department;

public class Tester_02 {

	private static SessionFactory sessionFactory ;
	
	private static SessionFactory buildSessoinFactory(){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = buildSessoinFactory().openSession();
		Department department = (Department)session.get(Department.class, 1);
		System.out.println(department);

	}

}
