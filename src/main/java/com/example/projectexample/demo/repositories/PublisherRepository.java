package com.example.projectexample.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.projectexample.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
