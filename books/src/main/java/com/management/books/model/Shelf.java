package com.management.books.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Shelf {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private Date ceateDdate;
	
	private String color;
	
	private Timestamp bookAdditionTime;
	
	private Timestamp bookDeletionTime;
	
	@OneToMany(mappedBy = "shelf")
	private Set<Book> books;
	
	
}
