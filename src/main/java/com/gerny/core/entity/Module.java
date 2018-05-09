package com.gerny.core.entity;

import java.util.HashSet;
import java.util.Set;

import org.apache.ibatis.type.Alias;


@Alias(value="Module")
public class Module {
	private Integer  moduleid;
	private String  modulename;
	private String  modulecode;
	
	private String  moduleuri;
	
	private Integer  parentid;
	
	public Set<Role> roleEntities = new HashSet<Role>();


	
	
	
	
	
	public Integer getModuleid() {
		return moduleid;
	}


	public void setModuleid(Integer moduleid) {
		this.moduleid = moduleid;
	}


	public String getModulename() {
		return modulename;
	}


	public void setModulename(String modulename) {
		this.modulename = modulename;
	}


	public String getModulecode() {
		return modulecode;
	}


	public void setModulecode(String modulecode) {
		this.modulecode = modulecode;
	}




	public String getModuleuri() {
		return moduleuri;
	}


	public void setModuleuri(String moduleuri) {
		this.moduleuri = moduleuri;
	}


	public Set<Role> getRoleEntities() {
		return roleEntities;
	}


	public void setRoleEntities(Set<Role> roleEntities) {
		this.roleEntities = roleEntities;
	}


	public Integer getParentid() {
		return parentid;
	}


	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}




	
	

}
