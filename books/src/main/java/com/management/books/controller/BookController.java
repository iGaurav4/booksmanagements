package com.management.books.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.management.books.model.Book;
import com.management.books.repository.BookRepository;

public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getShelves(){
		return (List<Book>) bookRepository.findAll();
	}
	
	@PutMapping
	public Book save(Book shelf) {
		return bookRepository.save(shelf);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathParam("id") Long id) {
		Optional<Book> shelf = bookRepository.findById(id);
		if(shelf.isPresent()) {
			bookRepository.delete(shelf.get());	
		}
	}
}
