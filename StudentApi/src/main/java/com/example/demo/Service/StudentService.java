package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> fetchAllStudent();

	public Student fetchStudentById(Long studentId);

	public void deleteStudentById(Long studentId);

	public Student updateStudent(Long studentId, Student student);

	

	

	

	

}
