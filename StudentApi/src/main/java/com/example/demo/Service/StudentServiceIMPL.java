package com.example.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student fetchStudentById(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteStudentById(Long studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
	}

	@Override
	public Student updateStudent(Long studentId, Student student) {
		// TODO Auto-generated method stub
		Student stdDb=studentRepository.findById(studentId).get();
		
		if(Objects.nonNull(student.getName())&& !"".equalsIgnoreCase(student.getName()))
		{
			stdDb.setName(student.getName());
		}
		if(Objects.nonNull(student.getEmail())&& !"".equalsIgnoreCase(student.getEmail()))
		{
			stdDb.setEmail(student.getEmail());
		}
		if(Objects.nonNull(student.getPhoneNumber())&& !"".equalsIgnoreCase(student.getPhoneNumber()))
		{
			stdDb.setPhoneNumber(student.getPhoneNumber());
		}
		if(Objects.nonNull(student.getAddress())&& !"".equalsIgnoreCase(student.getAddress()))
		{
			stdDb.setAddress(student.getAddress());
		}
		if(Objects.nonNull(student.getGender()))
		{
			stdDb.setGender(student.getGender());
		}
		
		
		return studentRepository.save(stdDb);
	}

	

	

	

	

}
