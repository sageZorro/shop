package com.gerny.core.service;

import com.gerny.core.entity.User;
import com.gerny.core.vo.UserVo;
import com.gerny.core.vo.page.PageResults;
import com.gerny.core.vo.page.PageVo;

public interface IUserService extends IBaseService<User, Integer> {
	PageResults<User> queryPage(UserVo vo, PageVo page);
	public User queryByName(String usernmae);
		
}
