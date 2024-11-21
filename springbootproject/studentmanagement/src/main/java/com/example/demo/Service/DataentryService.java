package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Dataentry;
import com.example.demo.Repository.DataentryRepo;

@Service
public class DataentryService {

	@Autowired
	DataentryRepo der;
	public List<Dataentry> M55() {
		// TODO Auto-generated method stub
		
		return der.findAll();
	}
	
	public boolean updatedata(Dataentry d) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			der.save(d);
		}
		catch(Exception e) {
			b=true;
		}
		return b;
	}

	public Dataentry getStudentById(Integer s_no) {
		// TODO Auto-generated method stub
		
		return der.getById(s_no);
	}

	
	public List<Dataentry> getAllStudents() {
		// TODO Auto-generated method stub
		
		return der.findAll();
	}


	public boolean deletedata(int regis) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			der.deleteById(regis);
	}
		catch(Exception e) {
		b=true;
	}
	return b;

}

	public Dataentry getStudentByrollno(String rollno) {
		// TODO Auto-generated method stub
		return der.getStudentByrollno(rollno);
	}
}