package com.ignite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("message", "Hello World!!! Welcome to Spring MVC!!!");
		return modelAndView;
	}

}
