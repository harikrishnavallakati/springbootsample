package com.springexample22.springbootsample;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.springframework.format.annotation.DateTimeFormat;

@javax.persistence.Entity
public class Student {
	@Id
	Long studentId;
	String name;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	LocalDate fromDate;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	LocalDate toDate;
	public Long getStudentId() {
		return studentId;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
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
