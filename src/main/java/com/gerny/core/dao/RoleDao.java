package com.gerny.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gerny.core.entity.Role;

@Mapper
public interface RoleDao {
	
	public void insert(Role t);
	public void delete(Role t);
	public void update(Role t);
	public Role queryById(Integer id);
	public List<Role> queryAll();
	public List<Role> queryList(Role vo);

}
