package com.controller;

import org.hibernate.NonUniqueObjectException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionCntroller {

	@ExceptionHandler(NonUniqueObjectException.class)
	public String handleCustomException(String ex,ModelMap model ) {

		model.addAttribute("productInCart", "Already in cart");
		return "redirect:/allProduct";
	}
}
