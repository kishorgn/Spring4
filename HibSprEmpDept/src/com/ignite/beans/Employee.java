package com.ignite.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue
	int eid;
	String fname;
	String lname;
	
	@ManyToOne
	@JoinColumn(name="did", nullable=true)
	Department department ;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String lname, Department department) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		String res = "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname;
		if(department != null){
			res+=", dname="+department.getDname();
		}
		return res;
	}

	
}
