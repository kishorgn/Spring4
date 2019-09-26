package com.ignite.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.beans.Department;
import com.ignite.beans.Employee;
import com.ignite.hibdaoimpl.DepartmentHibDao;
import com.ignite.hibdaoimpl.EmployeeHibDao;

public class SelectTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		DepartmentHibDao departmentDao = (DepartmentHibDao)ctxt.getBean("departmentDao");
		
		departmentDao.openSession();
		List<Department> departments = departmentDao.findAll();
		for(Department department : departments){
			System.out.println("id : "+department.getDit());
			System.out.println("name : "+department.getDname());
			System.out.println("location : "+department.getLocation());
			Set<Employee> employees = department.getEmployees();
			for (Employee employee : employees){
				System.out.println("empl.Id : "+employee.getEid());
				System.out.println("empl.Name : "+employee.getFname()+" - "+employee.getLname());
			}
		}

	}

}
