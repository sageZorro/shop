package com.gerny.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping(value="/re/{path1}/{path2}")
	public String redirect(@PathVariable String path1,@PathVariable String path2) {
	    return path1+"/"+path2;
	}
	@RequestMapping(value="/foword/{path1}/{path2}")
	public String forward(@PathVariable String path1,@PathVariable String path2) {
	    return "redirect:/"+path1+"/"+path2;
	}
	
}


