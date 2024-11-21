package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	
	private String staffname;
	@Id
	private String email;
	private String staffid;
	private String password;
	private String usertype;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String staffname, String email, String staffid, String password, String usertype) {
		super();
		this.staffname = staffname;
		this.email = email;
		this.staffid = staffid;
		this.password = password;
		this.usertype = usertype;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStaffid() {
		return staffid;
	}
	public void setStaffid(String staffid) {
		this.staffid = staffid;
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
		return "Admin [staffname=" + staffname + ", email=" + email + ", staffid=" + staffid + ", password=" + password
				+ ", usertype=" + usertype + "]";
	}
	
}
