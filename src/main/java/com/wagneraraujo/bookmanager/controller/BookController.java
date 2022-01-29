package com.wagneraraujo.bookmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagneraraujo.bookmanager.dto.MessageResponseDTO;
import com.wagneraraujo.bookmanager.entity.Book;
import com.wagneraraujo.bookmanager.repository.BookRepository;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

	private BookRepository bookRepository;

	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
		Book saveBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
				.message("Book create with id " + saveBook.getId())
				.build();
	}
	
}