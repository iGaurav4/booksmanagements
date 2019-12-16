package com.management.books.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.books.model.Shelf;
import com.management.books.repository.ShelfRepository;

@RestController("/shelf")
public class ShelfController {
	
	@Autowired
	private ShelfRepository shelfRepository;
	
	@GetMapping
	public List<Shelf> getShelves(){
		return (List<Shelf>) shelfRepository.findAll();
	}
	
	@PutMapping
	public Shelf save(Shelf shelf) {
		return shelfRepository.save(shelf);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathParam("id") Long id) {
		Optional<Shelf> shelf = shelfRepository.findById(id);
		if(shelf.isPresent()) {
			shelfRepository.delete(shelf.get());	
		}
	}
}
