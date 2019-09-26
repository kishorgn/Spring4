package com.ignite.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ignite.beans.Department;
import com.ignite.hibdaoimpl.DepartmentHibDao;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentHibDao departmentDao ;
	
	@RequestMapping(value="/getAllDepartments", method=RequestMethod.GET)
	public ModelAndView findAll() {
		ModelAndView modelAndView = new ModelAndView();
		departmentDao.openSession();
		List<Department> departments = departmentDao.findAll();
		modelAndView.setViewName("viewAllDepartments");
		modelAndView.addObject("departments",departments);
		System.out.println("modelAndView : "+modelAndView);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/getDepartment/{did}", method=RequestMethod.GET)
	public ModelAndView find(@PathVariable("did") int did){
		ModelAndView modelAndView = new ModelAndView();
		departmentDao.openSession();
		Department department = departmentDao.find(did);
		modelAndView.setViewName("viewDepartment");
		modelAndView.addObject("department", department);
		System.out.println("modelAndView : "+modelAndView);
		return modelAndView;
	}
	
	@RequestMapping(value="/insertDepartment", method=RequestMethod.GET)
	public ModelAndView insert(){
		ModelAndView modelAndView = new ModelAndView("getDepartment","command",new Department());
		return modelAndView;
	}
	
	@RequestMapping(value="/addDepartment", method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("department") Department department){
		ModelAndView modelAndView = new ModelAndView();
		departmentDao.openSession();
		Session session = departmentDao.getSession();
		session.beginTransaction();
		Department d = departmentDao.insert(department);
		session.getTransaction().commit();
		modelAndView.setViewName("deptInsertSuccess");
		modelAndView.addObject("deptno", d.getDit());
		return modelAndView;
	}
	
}
