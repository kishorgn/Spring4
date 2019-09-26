package com.ignite.app;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.dao.EmployeeDao;
import com.ignite.hibdaoimpl.EmployeeHibDao;

public class DsTester {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	EmployeeDao employeeDao ;
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
