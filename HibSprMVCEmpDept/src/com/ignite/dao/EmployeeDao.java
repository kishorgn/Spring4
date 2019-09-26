package com.ignite.dao;

import java.util.List;

import com.ignite.beans.Employee;

public interface EmployeeDao {
	
	List<Employee> findAll();
	Employee find(int eid);
	Employee insert(Employee employee);
	Employee udpate(Employee employee);
	boolean delete(int eid);

}
