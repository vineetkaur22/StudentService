package com.csye6225.spring2019.studentservice.datamodel;

import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String studentID;
	private String Image;
	private String programName;
	private List<Course> coursesEnrolled;

	public Student() {

	}

	public Student(String firstName, String lastName, String studentID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		//this.programName = programName;

	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "StudentId=" + getStudentID() + ", firstName=" + getFirstName()
		+ ", Program = " +getProgramName() ;

	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public List<Course> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<Course> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

}