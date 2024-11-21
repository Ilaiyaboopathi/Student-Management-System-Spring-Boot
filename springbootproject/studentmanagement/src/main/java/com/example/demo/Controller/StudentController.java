package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Dataentry;
import com.example.demo.Entity.User;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Repository.DataentryRepo;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.AdminService;
import com.example.demo.Service.DataentryService;
import com.example.demo.Service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
@Autowired
StudentService ss;

@Autowired
StudentRepo sr;

@Autowired
AdminService as;

@Autowired
AdminRepository ar;

@Autowired
DataentryService des;

@Autowired
DataentryRepo der;

	@RequestMapping("/index")
	public ModelAndView m1() {
		return new ModelAndView("index");
	}
	@RequestMapping("/register")
	public ModelAndView m11() {
		return new ModelAndView("register");
	}
	@RequestMapping(value="insertuser",method=RequestMethod.POST)
	public ModelAndView insertuser(HttpServletRequest req) {
		ModelAndView mv=null;
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String rollno=req.getParameter("rollno");
	String course=req.getParameter("course");
	String branch=req.getParameter("branch");
	String phone=req.getParameter("phone");
	String password=req.getParameter("password");
	
	User u=new User(name,email,rollno,course,branch,phone,password ,"User");
	sr.save(u);
	try {
		mv=new ModelAndView("success");
	}
	catch(Exception e) {
		mv=new ModelAndView("Error");
	}
	return mv;
	}
	@RequestMapping("/login")
	public ModelAndView m12() {
		return new ModelAndView("login");
	}
	@RequestMapping(value="loginuser", method=RequestMethod.GET)
	public ModelAndView loginuser(HttpServletRequest req, @RequestParam String email, @RequestParam String password) {
		ModelAndView mv=new ModelAndView("login");
		String email1=req.getParameter("email");
		User u1=sr.getById(email1);
		if(email1.equals(u1.getEmail())) {
			if(password.equals(u1.getPassword())) {
				mv.addObject("name",u1.getName());
				//System.out.println("if roll no and password crt "+u1.getName());
				mv=new ModelAndView("studentdata");
			}
			else {
				mv=new ModelAndView("backhome");
			}
		}
		else {
			mv=new ModelAndView("backhome");
		}
		return mv;
	}
	@RequestMapping("/adminregister")
	public ModelAndView m21() {
		return new ModelAndView("adminregister");
	}
	@RequestMapping(value="insertadmin",method=RequestMethod.POST)
	public ModelAndView insertadmin(HttpServletRequest req) {
		ModelAndView mv=null;
	String staffname=req.getParameter("staffname");
	
	String email=req.getParameter("email");
	String staffid=req.getParameter("staffid");
	String password=req.getParameter("password");
	
Admin a=new Admin(staffname,email,staffid,password ,"Admin");
	ar.save(a);
	try {
		mv=new ModelAndView("success2");
	}
	catch(Exception e) {
		mv=new ModelAndView("Error");
	}
	return mv;
	}
	
	
	@RequestMapping("/adminlogin")
	public ModelAndView m32() {
		return new ModelAndView("adminlogin");
	}
	@RequestMapping(value="loginadmin", method=RequestMethod.GET)
	public ModelAndView loginadmin(HttpServletRequest req, @RequestParam String email, @RequestParam String password) {
		ModelAndView mv=new ModelAndView("adminlogin");
		String email1=req.getParameter("email");
		Admin a1=ar.getById(email1);
		if(email1.equals(a1.getEmail())) {
			if(password.equals(a1.getPassword())) {
				//mv.addObject("name",a1.getName());
				//System.out.println("if roll no and password crt "+u1.getName());
				mv=new ModelAndView("enterdata");
			}
			else {
				mv=new ModelAndView("backhome1");
			}
		}
		else {
			mv=new ModelAndView("Error");
		}
		return mv;
	}
	
	//Datainsert Method
	
	@RequestMapping("/datainsert")
	public ModelAndView m41() {
		return new ModelAndView("datainsert");
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public ModelAndView insert(HttpServletRequest req) {
		ModelAndView mv=null;
	//String s_no=req.getParameter("s_no");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String rollno=req.getParameter("rollno");
	String registerno=req.getParameter("registerno");
	String semester=req.getParameter("semester");
	String subject=req.getParameter("subject");
	String mark=req.getParameter("mark");
	String grade=req.getParameter("grade");
	String result=req.getParameter("result");
	
	Dataentry d=new Dataentry(0,name,email,rollno,registerno,semester,subject,mark,grade,result ,"Dataentry");
	der.save(d);
	try {
		mv=new ModelAndView("success1");
	}
	catch(Exception e) {
		mv=new ModelAndView("Error");
	}
	return mv;
	}
	
	//View the Records
	
	@RequestMapping("viewdata")
	public ModelAndView M55() {
		List<Dataentry> li=des.M55();
		ModelAndView mv=new ModelAndView("viewdata");
		mv.addObject("stu",li);
		return mv;
	}
	
	
	//updatestudent records
	@RequestMapping("/updatedata")
	public ModelAndView updatedata(HttpServletRequest req,@RequestParam int s_no) {
		ModelAndView mv=new ModelAndView("updatedata");
		Dataentry d=des.getStudentById(s_no);
		mv.addObject("Dataentry",d);
		return mv;
	}
	@RequestMapping(value="updatedata1",method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest req) {
     ModelAndView mv=null;
	//String s_no=req.getParameter("s_no");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String rollno=req.getParameter("rollno");
	String registerno=req.getParameter("registerno");
	String semester=req.getParameter("semester");
	String subject=req.getParameter("subject");
	String mark=req.getParameter("mark");
	String grade=req.getParameter("grade");
	String result=req.getParameter("result");
	
	Dataentry d=new Dataentry(Integer.parseInt(req.getParameter("s_no")),name,email,rollno,registerno,semester,subject,mark,grade,result,"Admin");
	try {
		des.updatedata(d);
		List<Dataentry> li=des.M55();
		ModelAndView mv1=new ModelAndView("viewdata");
		mv1.addObject("stu",li);
		return mv1;
	}
	catch(Exception e) {
		mv=new ModelAndView("Error");
	}
	return mv;
	}
	
	//deletedata
	
	@RequestMapping(value="deletedata",method=RequestMethod.GET)
		public ModelAndView deletedata(HttpServletRequest req) {
		ModelAndView mv=null;
	    int regis=Integer.parseInt(req.getParameter("s_no"));
		try {
			des.deletedata(regis);
			mv=new ModelAndView("viewdata");
			List<Dataentry> li=des.getAllStudents();
			mv.addObject("stu",li);
		}
		catch(Exception e) {
			mv=new ModelAndView("Error");
		}
		return mv;
	}
	// view one student records
	
	@RequestMapping("studentdata")
	public ModelAndView data() {
		return new ModelAndView("studentdata");
	}
	 @RequestMapping(value = "click",method = RequestMethod.POST)
	    public ModelAndView search(HttpServletRequest req) {
	        ModelAndView mv = new ModelAndView();
	        String rollno = req.getParameter("rollno"); // Get the 'search' parameter from form

	        // Search in the database through the repository method
	        List<Dataentry> entities = der.findByRollno(rollno);

	        if (!entities.isEmpty()) {
	            // If names are found, add the list of entities to the ModelAndView
	            mv.addObject("Dataentry", entities); // Add the result list to the ModelAndView
	            mv.setViewName("search"); // Direct to the search result page (JSP or Thymeleaf)
	        } else {
	            // If name is not found, show an error message
	            mv.addObject("Error", "No results found for: " + rollno);
	            mv.setViewName("norecords"); // Stay on the search page
	        }

	        return mv;
	    }
}
