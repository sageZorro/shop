package com.gerny.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerny.core.entity.User;
import com.gerny.core.service.IUserService;
import com.gerny.core.service.impl.UserService;
import com.gerny.core.vo.UserVo;
import com.gerny.core.vo.page.PageVo;
import com.gerny.core.vo.page.PageResults;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	
	@RequestMapping("/")
	public String user() {
		  return "user/user_list";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public PageResults<User> userlist(UserVo vo,PageVo page) {

		return userService.queryPage(vo,page);
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public String edit(User user) {
		if(user.getUserid()!=null && user.getUserid()!=0){
			userService.update(user);
		}else{
			userService.save(user);
		}
		
		return "success";
	}
	
/*	@RequestMapping("/remove/{id}")
	@ResponseBody
	public boolean remove(@PathVariable Integer id) {
		return userService.deleteById(id);
	}
*/
	
}
