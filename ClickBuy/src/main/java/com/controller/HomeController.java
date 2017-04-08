package com.controller;

	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Customer;
//import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HomeController {
	
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home(ModelAndView session , Customer c)
		{	  
			session.addObject("name",c.getFirstName());
		      return "home";
		}
		@RequestMapping(value = "/home", method = RequestMethod.GET)
		public String h(ModelMap model) {
		      model.addAttribute("message", "WELCOME TO SOFTWARE CART");
		      return "home";
		}
		@RequestMapping("/about")
		public String about()
		{
			return "about";
		}
		

	}


