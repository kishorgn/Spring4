package com.ignite.app;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.hibdaoimpl.EmployeeHibDao;

public class DSTesterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		DsTester dsTester = (DsTester)ctxt.getBean("dsTester", DsTester.class);
		System.out.println("dataSource : "+dsTester.getDataSource());
		System.out.println("sessionFactory : "+dsTester.getSessionFactory());
		System.out.println("employeeDao : "+dsTester.getEmployeeDao());
		


	}


}
