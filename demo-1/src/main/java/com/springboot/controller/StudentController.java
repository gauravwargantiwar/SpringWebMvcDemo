package com.springboot.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentSer;

@RestController
public class StudentController {

	Logger log=Logger.getLogger(StudentController.class);
	
	@Autowired
	StudentSer studser;
	
	
	@GetMapping("/")
	public String show() 
	{
		log.info("hi");
		return "i am java developer";
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student s)
	{
		
		return studser.addStudent(s);
		
	}
	@GetMapping("/getStudent")
	public List<Student> getStudent()
	{

		log.info(studser.getAll());
		return studser.getAll();
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id)
	{
		log.info(studser.get(id));
		return studser.get(id);
		
	}
	@DeleteMapping("/student/{id}")
	public boolean deletestudent(@PathVariable int id)
	{
		log.info(studser.delete(id));
		return studser.delete(id);
		
	}
	@PutMapping("/student/{id}")
	public Student updatestudent(@RequestBody Student s,@PathVariable int id) {
		
		return studser.update(s);
		
	}
	
}
