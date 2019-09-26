package com.ignite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@RequestMapping(value="/index")
	public ModelAndView showIndexPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("msg", "<h3>HomePage</h3>");
		return modelAndView;
	}
}
