package com.example.projectexample.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.projectexample.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
