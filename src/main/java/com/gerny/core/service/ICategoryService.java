package com.gerny.core.service;

import java.util.List;

import com.gerny.core.entity.Role;
import com.gerny.core.entity.prod.Category;

public interface ICategoryService extends IBaseService<Role, Integer> {

	List<Category> queryList(Category record);
	
		
}
