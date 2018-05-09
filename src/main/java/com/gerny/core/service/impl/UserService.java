package com.gerny.core.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gerny.core.dao.UserDao;
import com.gerny.core.entity.User;
import com.gerny.core.service.IUserService;
import com.gerny.core.util.Encoder;
import com.gerny.core.vo.UserVo;
import com.gerny.core.vo.page.PageResults;
import com.gerny.core.vo.page.PageVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class UserService implements IUserService{
	
	@Autowired
	UserDao userdao;
	
	@Override
	public PageResults<User> queryPage(UserVo vo,PageVo pagevo) {
		Integer page_num = (pagevo.getStart()/ pagevo.getLength()) + 1;
    	PageHelper.startPage(page_num, pagevo.getLength());
    	List<User> list = userdao.queryList(vo);
    	PageInfo<User> page = new PageInfo<>(list);
    	
    	PageResults<User> result = new PageResults<>();
    	result.setDraw(pagevo.getDraw());
    	result.setData(page.getList());
    	result.setRecordsTotal((int)page.getTotal());
    	result.setRecordsFiltered(result.getRecordsTotal());
		return result;
	}

	@Override
	public User queryByName(String username) {
		return userdao.queryByName(username);
	}

	@Override
	public void save(User t) {
		t.setPassword(Encoder.encode(t.getPassword()));
		t.setCreatedate(new Date());
		userdao.insert(t);
	}

	@Override
	public User get(Integer id) {
		return userdao.queryById(id);
	}

	@Override
	public void delete(User t) {
		userdao.delete(t);
		
	}

	@Override
	public boolean deleteById(Integer Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll(Collection<User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User t) {
		t.setPassword(Encoder.encode(t.getPassword()));
		userdao.update(t);
		
	}


}
