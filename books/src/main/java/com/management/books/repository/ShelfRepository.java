package com.management.books.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.books.model.Shelf;

@Repository
public interface ShelfRepository extends CrudRepository<Shelf, Long> {

}
