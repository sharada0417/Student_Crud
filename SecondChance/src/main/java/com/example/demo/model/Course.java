package com.example.demo.model;

public class Course {
	private String code;
	private String name;
	private int credits;
	
	public Course(String code, String name, int credits) {
		super();
		this.code = code;
		this.name = name;
		this.credits = credits;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
}
