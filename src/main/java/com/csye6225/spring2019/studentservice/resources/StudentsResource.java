package com.csye6225.spring2019.studentservice.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.csye6225.spring2019.studentservice.datamodel.Student;
import com.csye6225.spring2019.studentservice.services.StudentsService;

// .. /webapi/myresource
@Path("students")
public class StudentsResource {

	StudentsService studentService = new StudentsService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent(){
		return studentService.getAllStudents();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudentsByProgram(
			@QueryParam("program") String program) {

		if (program == null) {
			return studentService.getAllStudents();
		}
		return studentService.getStudentsByProgram(program);
	}

	@GET
	@Path("/{studentID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("studentID") String studentID) {
		System.out.println("Student you are looking for : " + studentID);
		return studentService.getStudent(studentID);
	}

	@DELETE
	@Path("/{studentID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student deleteStudent(@PathParam("studentID") long studentID) {
		return studentService.deleteStudent(studentID);
	}


	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student addStudent(Student student) {
		student.setStudentID(student.getFirstName()+student.getLastName());
		student.setStudentID(student.getStudentID());
		return studentService.addStudent(student);
	}


	@PUT
	@Path("/{studentID}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(@PathParam("studentID") long studentID, 
			Student student) {
		return studentService.updateStudentInformation(String.valueOf(studentID), student);
	}

}

