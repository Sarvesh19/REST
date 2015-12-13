package com.techtutorial.rest;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	// This Method can get All student from DB or something else 
	// here we are using hardcoded Student Object for simplicity 
	public Student getStudent() {
		Student std = new Student();
		std.setName("Jami");
		std.setAddress("India");
		std.setId(1);

		return std;

	}
	
	// This Method can get All student from DB or something else 
	// here we are using hardcoded Student Object for simplicity 
	public List<Student> getStudents(){
		
		List<Student> stdList = new ArrayList<Student>();
		
		Student std1 = new Student();
		std1.setName("Jami");
		std1.setAddress("India");
		std1.setId(1);
		
		Student std2 = new Student();
		std2.setName("Kami");
		std2.setAddress("USA");
		std2.setId(2);
		
		stdList.add(std1);
		stdList.add(std2);
		
		
		return stdList;
		
	}

}
