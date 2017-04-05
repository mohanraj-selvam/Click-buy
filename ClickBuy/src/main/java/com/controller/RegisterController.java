package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.CustomerDao;
import com.model.Customer;

@Controller
public class RegisterController {
	@Autowired
	CustomerDao cd;
	@RequestMapping("/register")
	public String register()
	{
		return"register";
	}
	@ModelAttribute("cust")
	public Customer getCust(){
		return new Customer();
	}
	@RequestMapping(value= "/register/addcustomer", method = RequestMethod.POST)
	public String register(@ModelAttribute("cust") Customer c)
	{
		cd.addCustomer(c);
			return "redirect:/login";		
	}
}