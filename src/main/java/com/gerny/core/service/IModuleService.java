package com.gerny.core.service;

import java.util.List;

import com.gerny.core.entity.Module;

public interface IModuleService extends IBaseService<Module, Integer> {

	List<Module> queryAll();
	//public List<Module> findAll();
}
