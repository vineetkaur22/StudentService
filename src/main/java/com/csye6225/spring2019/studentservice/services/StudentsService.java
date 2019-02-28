package com.csye6225.spring2019.studentservice.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.csye6225.spring2019.studentservice.datamodel.InMemoryDatabase;
import com.csye6225.spring2019.studentservice.datamodel.Professor;
import com.csye6225.spring2019.studentservice.datamodel.Student;

public class StudentsService {

	static HashMap<Long, Student > student_Map = new InMemoryDatabase().getStudentDB();


	public List<Student> getAllStudents(){
		ArrayList<Student> list = new ArrayList<>();
		for (Student stu : student_Map.values()) {
			list.add(stu);
		}
		return list;
	}

	public void addStudent(String firstName, String lastName) {
		// Next Id 
		long nextAvailableId = student_Map.size() + 1;

		//Create a Student Object
		Student student = new Student(firstName , lastName, firstName+lastName);

		student_Map.put(nextAvailableId, student);		
	}

	public Student addStudent( Student student) {
		// Next Id 
		long nextAvailableId = student_Map.size() + 1;

		student_Map.put(nextAvailableId, student);		
		return student;
	}

	public Student getStudent(String studentID) {

		//Simple HashKey Load
		Student student = student_Map.get(studentID);
		System.out.println("Item retrieved:");
		System.out.println(student.toString());

		return student;
	}

	// Deleting a student
	public Student deleteStudent(Long studentID) {
		Student deletedStudentDetails = student_Map.get(studentID);
		student_Map.remove(studentID);
		return deletedStudentDetails;
	}

	// Updating Student Info
	public Student updateStudentInformation(String studentID, Student student) {	
		Student oldStudentObject = student_Map.get(studentID);
		studentID = oldStudentObject.getStudentID();
		student.setStudentID(studentID);
		return student;
	}

	// Get students in a Program
	public List<Student> getStudentsByProgram(String Program) {	
		//Getting the list
		ArrayList<Student> list = new ArrayList<>();
		for (Student student : student_Map.values()) {
			if (student.getProgramName().equals(Program)) {
				list.add(student);
			}
		}
		return list ;
	}



}
