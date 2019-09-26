package com.ignite.beans;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue
	int dit;
	String dname;
	String location;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	Set<Employee> employees;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	}
	public int getDit() {
		return dit;
	}
	public void setDit(int dit) {
		this.dit = dit;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [dit=" + dit + ", dname=" + dname + ", location=" + location + ", employees=" + employees
				+ "]";
	}
	
	
}
