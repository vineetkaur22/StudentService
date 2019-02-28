package com.csye6225.spring2019.studentservice.datamodel;

import java.util.HashMap;

public class InMemoryDatabase {

	private static HashMap<Long, Professor> professorDB = new HashMap<> ();
	private static HashMap<Long, Student> studentDB = new HashMap<>();
	private static HashMap<Long, Course> courseDB = new HashMap<>();


	public static HashMap<Long, Professor> getProfessorDB() {
		return professorDB;
	}

	public static HashMap<Long, Student> getStudentDB(){
		return studentDB;
	}

}
