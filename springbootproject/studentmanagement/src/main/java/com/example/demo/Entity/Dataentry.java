package com.example.demo.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Dataentry {
    @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int s_no;
	private String name;
    private String email;
	private String rollno;
	private String registerno;
	private String semester;
	private String subject;
	private String mark;
	private String grade;
	private String result;
	private String usertype;
	public Dataentry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dataentry(int s_no, String name, String email, String rollno, String registerno, String semester,
			String subject, String mark, String grade, String result, String usertype) {
		super();
		this.s_no = s_no;
		this.name = name;
		this.email = email;
		this.rollno = rollno;
		this.registerno = registerno;
		this.semester = semester;
		this.subject = subject;
		this.mark = mark;
		this.grade = grade;
		this.result = result;
		this.usertype = usertype;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
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
	public String getRegisterno() {
		return registerno;
	}
	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "Dataentry [s_no=" + s_no + ", name=" + name + ", email=" + email + ", rollno=" + rollno
				+ ", registerno=" + registerno + ", semester=" + semester + ", subject=" + subject + ", mark=" + mark
				+ ", grade=" + grade + ", result=" + result + ", usertype=" + usertype + "]";
	}
	
	
	
}
