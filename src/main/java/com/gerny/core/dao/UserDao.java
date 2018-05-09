package com.gerny.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gerny.core.entity.User;
import com.gerny.core.vo.UserVo;


@Mapper
public interface UserDao {

	public void insert(User t);
	public void delete(User t);
	public void update(User t);
	public User queryById(Integer id);
	public User queryByName(String username);
	public List<User> queryList(UserVo vo);
}
