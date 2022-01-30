package com.wagneraraujo.bookmanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagneraraujo.bookmanager.dto.BookDTO;
import com.wagneraraujo.bookmanager.dto.MessageResponseDTO;
import com.wagneraraujo.bookmanager.service.BookService;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
	public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
		return bookService.create(bookDTO);
	}
	
}
