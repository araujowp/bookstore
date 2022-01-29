package com.wagneraraujo.bookmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagneraraujo.bookmanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
}
