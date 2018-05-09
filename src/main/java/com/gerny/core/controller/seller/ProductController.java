package com.gerny.core.controller.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerny.core.service.impl.UserService;

@Controller
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	UserService userService;
	
	
	
	@RequestMapping("/index")
	public String index() {
		  return "prod/index";
	}
	
	@RequestMapping("/add")
	public String add() {
		  return "prod/add";
	}
	
	
}
