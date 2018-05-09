package com.gerny.core.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerny.core.dao.prod.CategoryDao;
import com.gerny.core.entity.Role;
import com.gerny.core.entity.prod.Category;
import com.gerny.core.service.ICategoryService;
@Service
public class CategoryService implements ICategoryService{

	
	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public List<Category> queryList(Category record) {
		return categoryDao.queryList(record);

	}

	@Override
	public void save(Role t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Role t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteById(Integer Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll(Collection<Role> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role t) {
		// TODO Auto-generated method stub
		
	}
}
