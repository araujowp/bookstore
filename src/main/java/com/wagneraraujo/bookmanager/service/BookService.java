package com.wagneraraujo.bookmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagneraraujo.bookmanager.dto.MessageResponseDTO;
import com.wagneraraujo.bookmanager.entity.Book;
import com.wagneraraujo.bookmanager.repository.BookRepository;


@Service
public class BookService {

	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create(Book book) {
		Book saveBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
				.message("Book create with id " + saveBook.getId())
				.build();
	}

	
}
