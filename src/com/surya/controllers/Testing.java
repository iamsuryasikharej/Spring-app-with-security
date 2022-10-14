package com.surya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Testing {
	@RequestMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}
	@RequestMapping("/success")
	public ModelAndView success()
	{
		return new ModelAndView("success");
	}

}
