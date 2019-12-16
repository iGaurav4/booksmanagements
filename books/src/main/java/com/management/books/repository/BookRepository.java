package com.management.books.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.books.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
