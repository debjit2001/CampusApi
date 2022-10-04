package com.jupyter.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table
public class Campus {
	
	@Id
	private int campusCode;
	private String comments;
	public Campus() {
		// TODO Auto-generated constructor stub
	}
	public int getCampusCode() {
		return campusCode;
	}
	public void setCampusCode(int campusCode) {
		this.campusCode = campusCode;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Campus(int campusCode, String comments) {
		super();
		this.campusCode = campusCode;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Campus [campusCode=" + campusCode + ", comments=" + comments + "]";
	}
	
	
	
	
	

}