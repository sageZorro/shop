package com.gerny.core.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gerny.core.dao.ModuleDao;
import com.gerny.core.entity.Module;
import com.gerny.core.service.IModuleService;

@Service
@Transactional
public class ModuleService implements IModuleService{
	
	@Autowired
	ModuleDao moduleDao;
	


	@Override
	public List<Module> queryAll() {
		return moduleDao.queryAll();
	}



	@Override
	public boolean deleteById(Integer Id) {
		return moduleDao.deleteById(Id);
	}



	@Override
	public void save(Module t) {
		moduleDao.insert(t);
		
	}



	@Override
	public Module get(Integer id) {
		return moduleDao.queryById(id);
	}



	@Override
	public void delete(Module t) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll(Collection<Module> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(Module t) {
		// TODO Auto-generated method stub
		
	}



}
