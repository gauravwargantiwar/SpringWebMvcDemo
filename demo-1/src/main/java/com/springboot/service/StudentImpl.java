package com.springboot.service;

import java.util.List;

import com.springboot.model.Student;

public interface StudentImpl {
	public String addStudent(Student s);
	public List<Student> getAll();
	public Student get(int id);
	public Student update(Student s);
	public boolean delete(int id);
}
