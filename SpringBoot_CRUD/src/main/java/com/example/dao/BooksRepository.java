package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
