package com.ignite.hibdaoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.beans.Employee;
import com.ignite.dao.EmployeeDao;

public class EmployeeHibDao implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory ;
	Session session;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void openSession(){
		System.out.println("inside employeehibdao sessionFactory : "+sessionFactory);
		session = getSessionFactory().openSession();
	}
	
	public void closeSession(){
		session.close();
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee find(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee insert(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Trying to insert : "+employee);
		session.save(employee);
		System.out.println("Inserted successfully : "+employee);
		return employee;
	}

	@Override
	public Employee udpate(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		return false;
	}

}
