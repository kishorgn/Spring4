package com.ignite.app;

import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.beans.Department;
import com.ignite.beans.Employee;
import com.ignite.hibdaoimpl.DepartmentHibDao;
import com.ignite.hibdaoimpl.EmployeeHibDao;
import org.hibernate.Session;

public class InsertTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		Department department = new Department("Development", "Hyderabad");
		
		/****/
		Employee e1 = new Employee("Kishor", "Kumar", department);
		Employee e2 = new Employee("Koushik", "Guptha", department);
		Employee e3 = new Employee("Rajesh", "Verma", department);
		
		department.setEmployees(new HashSet<>());
		department.getEmployees().add(e1);
		department.getEmployees().add(e2);
		department.getEmployees().add(e3);
		
		DepartmentHibDao departmentDao = (DepartmentHibDao)ctxt.getBean("departmentDao");
		
		departmentDao.openSession();

		System.out.println("Before begin transaction with department");
		Session session = departmentDao.getSession();

		session.beginTransaction();
		System.out.println("After begin transaction with department");
		
		departmentDao.insert(department);
		
		System.out.println("Before commiting department");
		departmentDao.getSession().getTransaction().commit();
		System.out.println("After commiting department");
		
//		EmployeeHibDao employeeHibDao = (EmployeeHibDao)ctxt.getBean("employeeDao", EmployeeHibDao.class);
//		System.out.println("employeehibdao : "+employeeHibDao);
//		employeeHibDao.openSession();
//		employeeHibDao.getSession().beginTransaction();
//		employeeHibDao.insert(e1);
//		employeeHibDao.insert(e2);
//		employeeHibDao.insert(e3);
//		System.out.println("Before commit employee");
//		employeeHibDao.getSession().getTransaction().commit();
//		System.out.println("After commit employee");
		
		System.out.println("End of the program!!!");
		
	}

}
