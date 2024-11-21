package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	private String name;
	@Id
	private String email;
	private String rollno;
	private String course;
	private String branch;
	private String phone;
	private String password;
	private String usertype;
	public User(String name, String email, String rollno, String course, String branch, String phone, String password,
			String usertype) {
		super();
		this.name = name;
		this.email = email;
		this.rollno = rollno;
		this.course = course;
		this.branch = branch;
		this.phone = phone;
		this.password = password;
		this.usertype = usertype;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", rollno=" + rollno + ", course=" + course + ", branch="
				+ branch + ", phone=" + phone + ", password=" + password + ", usertype=" + usertype + "]";
	}
	
	
	
	
	
}
