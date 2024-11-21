package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;
@Repository
public interface StudentRepo extends JpaRepository<User,String>{
	//@Query(value="select rollno from student",nativeQuery=true)
	//List<String> getrollno();

//@Query(value="select * from student where rollno=:lang",nativeQuery=true)
//List<Movie> getMoviesByLanguage(String lang);
	

}
