package com.gerny.core.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.ibatis.type.Alias;

@Alias(value="User")
public class User {
	private Integer  userid;
	private String  username;
	private String  password;
	private String  truename;
	private String  phone;
	private String  mobile;
	private Date  createdate;
	
	
	private Set<Role> roleEntities = new HashSet<Role>();

	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Set<Role> getRoleEntities() {
		return roleEntities;
	}
	public void setRoleEntities(Set<Role> roleEntities) {
		this.roleEntities = roleEntities;
	}

	
	
	
	
}
