package com.management.books.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.books.model.Student;
import com.management.books.repository.StudentRepository;

@RestController("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public List<Student> getShelves(){
		return (List<Student>) studentRepository.findAll();
	}
	
	@PutMapping
	public Student save(Student shelf) {
		return studentRepository.save(shelf);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathParam("id") Long id) {
		Optional<Student> shelf = studentRepository.findById(id);
		if(shelf.isPresent()) {
			studentRepository.delete(shelf.get());	
		}
	}
}
