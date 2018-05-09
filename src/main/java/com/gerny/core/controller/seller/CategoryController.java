package com.gerny.core.controller.seller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerny.core.entity.prod.Category;
import com.gerny.core.service.ICategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	
	@Autowired
	ICategoryService categoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Category> list(Category category) {
		return categoryService.queryList(category);
	}

}
