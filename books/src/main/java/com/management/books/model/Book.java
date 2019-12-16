package com.management.books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	
	private String author;
	
	private String description;
	
	private float rating;
	
	@Lob
    @Column(name = "content", columnDefinition="CLOB")
    private String content;
	//creating shelf 
	@OneToOne
	@JoinColumn(name = "shelf",referencedColumnName = "id")
	private Shelf shelf;
}
