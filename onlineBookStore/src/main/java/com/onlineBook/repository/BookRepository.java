package com.onlineBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBook.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	

}
