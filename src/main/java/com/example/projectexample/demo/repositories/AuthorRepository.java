package com.example.projectexample.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.projectexample.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
