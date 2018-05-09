package com.gerny.core.entity;

import java.util.HashSet;
import java.util.Set;

import org.apache.ibatis.type.Alias;

@Alias(value="Role") 
public class Role {
	private Integer roleid;
	private String rolename;
	
	private Set<Module> modules = new HashSet<Module>();

	private Set<User> users = new HashSet<User>();


	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	
	

}
