package com.csye6225.spring2019.studentservice.datamodel;

import java.util.List;

public class Program {

	private String programName;
	private List<Course> coursesName;

	public Program() {

	}

	public Program( String programName ) {
		this.programName = programName;

	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}


}
