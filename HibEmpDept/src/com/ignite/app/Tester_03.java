package com.ignite.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ignite.beans.Employee;

public class Tester_03 {

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
		SessionFactory sessionFactory = buildSessoinFactory();
		Session session = sessionFactory.openSession();
		String hql = "from Employee";
		Query query = session.createQuery(hql);
		
		List<Employee> employees =(List<Employee>) query.list();
		for(Employee employee : employees){
			System.out.println(employee);
		}
		session.close();
		sessionFactory.close();
	}

}
