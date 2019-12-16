package com.management.books.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.books.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
