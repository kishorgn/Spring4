package com.ignite.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ignite.beans.Department;
import com.ignite.beans.Employee;

public class Tester_01 {

	static Session session;
	static SessionFactory sessionFactory;
	
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
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		Department dept1 = new Department("Production", "Bengaluru");
		
		Employee emp1 = new Employee("Rajesh", "Kumar", dept1);
		
		Employee emp2 = new Employee("Koushik", "Gupta",dept1);
		
//		dept1.getEmployees().add(emp1);
//		dept1.getEmployees().add(emp2);
		
		
		session.save(dept1);
		session.save(emp1);
		session.save(emp2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		System.out.println("Records saved successfully....");
	}

}
