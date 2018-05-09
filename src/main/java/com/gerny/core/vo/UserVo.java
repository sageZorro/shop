package com.gerny.core.vo;

import java.util.Date;

import com.gerny.core.entity.User;

public class UserVo extends User  {
	private Date beginDate;
	private Date endDate;
	
	
	
	
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	
	
}
