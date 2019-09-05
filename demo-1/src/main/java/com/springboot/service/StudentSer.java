package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentDao;
import com.springboot.model.Student;

@Service
public class StudentSer implements  StudentImpl
{

	@Autowired
	StudentDao studdao;
	
	@Override
	public String addStudent(Student s) {

		studdao.save(s);
		return "Add Student";
	}
	public List<Student> getAll() {
		 return studdao.findAll();
	}
	@Override
	public Student get(int id) {
		
		if(studdao.findById(id).isPresent())
				return studdao.findById(id).get();
		else
			return new Student();
		}
	
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		studdao.deleteById(id);
		return false;
	}
	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return null;
	}
}