package com.gerny.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gerny.core.entity.Module;

@Mapper
public interface ModuleDao {

	public void insert(Module t);
	public void delete(Module t);
	public void update(Module t);
	public Module queryById(Integer id);
	public Module queryByName(String username);
	public List<Module> queryList(Module vo);
	List<Module> queryAll();
	public boolean deleteById(Integer id);

}
