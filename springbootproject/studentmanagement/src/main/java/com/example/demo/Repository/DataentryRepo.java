package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Dataentry;

@Repository
public interface DataentryRepo extends JpaRepository<Dataentry,Integer>{
	 Dataentry getStudentByrollno(String rollno);
 @Query(value="Select * from dataentry where rollno=:rollno",nativeQuery=true)
	List<Dataentry> findByRollno(String rollno);

	
	}


