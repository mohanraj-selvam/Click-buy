package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
@RequestMapping("/login?error")
public String loginerr(ModelAndView req,@RequestParam(value="error") String error)
{	req.addObject("error","Invalid Username and Password.. Please enter valid username and password");
	return "login";
}
@RequestMapping(value="/login", method=RequestMethod.POST)
public String login(@RequestParam(value="error",required=false) String error, @RequestParam(value="success",required=false) String success,
		ModelAndView req){
	if(error!=null)
		req.addObject("error","Invalid Username and Password.. Please enter valid username and password");
	if(success!=null)
		req.addObject("success","Registered Successfully");
		
	return "login";
}
}
