package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> fetchAllStudent()
	{
		return studentService.fetchAllStudent();
	}
	
	@GetMapping("/students/{id}")
	public Student fetchStudentById(@PathVariable("id") Long studentId)
	{
		return studentService.fetchStudentById(studentId);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable("id") Long studentId)
	{
		studentService.deleteStudentById(studentId);
		return "Student Deleted Sucessfully!!!";
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable("id") Long studentId,
									@RequestBody Student student)
	{
		return studentService.updateStudent(studentId,student);
	}
	
	
	
}
