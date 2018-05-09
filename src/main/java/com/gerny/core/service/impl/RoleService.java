package com.gerny.core.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gerny.core.dao.RoleDao;
import com.gerny.core.entity.Role;
import com.gerny.core.service.IRoleService;
import com.gerny.core.vo.page.PageResults;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RoleService implements IRoleService{
	
	@Autowired
	RoleDao roleDao;
	

	@Override
	public void save(Role t) {
		roleDao.insert(t);
	}

	@Override
	public Role get(Integer id) {
		return roleDao.queryById(id);
	}

	@Override
	public void delete(Role t) {
		roleDao.delete(t);
		
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
		roleDao.update(t);
	}

	@Override
	public List<Role> listAll() {
		return roleDao.queryAll();
	}
	
	@Override
	public PageResults<Role> queryPage(Role vo, Integer start, Integer length) {
		Integer page_num = (start / length) + 1;
    	PageHelper.startPage(page_num, length);
    	List<Role> list = roleDao.queryList(vo);
    	PageInfo<Role> page = new PageInfo<>(list);
    	
    	PageResults<Role> result = new PageResults<>();
    	result.setData(page.getList());
    	result.setRecordsTotal((int)page.getTotal());
		return result;
	}

	
}
