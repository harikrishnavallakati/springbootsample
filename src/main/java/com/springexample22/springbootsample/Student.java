package com.springexample22.springbootsample;

import java.sql.Date;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class Student {
	@Id
	Long studentId;
	String name;
	Date fromDate;
	Date toDate;
	public Long getStudentId() {
		return studentId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
