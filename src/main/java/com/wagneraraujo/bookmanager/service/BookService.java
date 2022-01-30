package com.wagneraraujo.bookmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagneraraujo.bookmanager.dto.BookDTO;
import com.wagneraraujo.bookmanager.dto.MessageResponseDTO;
import com.wagneraraujo.bookmanager.entity.Book;
import com.wagneraraujo.bookmanager.mapper.BookMapper;
import com.wagneraraujo.bookmanager.repository.BookRepository;


@Service
public class BookService {

	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create(BookDTO bookDTO) {
		
		Book bookToSave = bookMapper.toModel(bookDTO);
		
		Book saveBook = bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book create with id " + saveBook.getId())
				.build();
	}

	
}
