package com.gerny.core.service;

import java.util.List;

import com.gerny.core.entity.Role;
import com.gerny.core.vo.page.PageResults;

public interface IRoleService extends IBaseService<Role, Integer> {
	public PageResults<Role> queryPage(Role vo, Integer start, Integer length);
	List<Role> listAll();
		
}
