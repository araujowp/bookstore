package com.wagneraraujo.bookmanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wagneraraujo.bookmanager.entity.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

	private Long id;
	
	@NotBlank
	@Size(max = 200)
	private String name;
	
	@NotNull
	private Integer pages;
	
	@NotNull
	private Integer chapters;
	
	@NotBlank
	@Size(max = 100)
	
	private String isbn;
	
	@NotBlank
	@Size(max = 200)
//	@Pattern(regexp= "(?:ISBN(?:-10)?:? )?(?=[-0-9X ]{13}$|[0-9X]{10}$)[0-9]{1,5}[- ]?(?:[0-9]+[- ]?){2}[0-9X]$", 
//		message ="ISBN format must be a valid format")
	private String publisherName;
	
	@Valid
	@NotNull
	private Author author;
	
}
