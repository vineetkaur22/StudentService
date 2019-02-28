package com.csye6225.spring2019.studentservice.datamodel;

import java.util.List;

public class Course {
	
	private String name;
	private String courseID;
	private List<Student> studentsEnrolled;
	private Professor professor;
	private List<Lecture> lectures;
	
	public Course() {
		
	}
	public Course(String name, String courseID, Professor professor) {
		this.name = name;
		this.courseID = courseID;
		this.professor = professor;
	}
	

}


