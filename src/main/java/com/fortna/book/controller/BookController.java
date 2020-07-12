package com.fortna.book.controller;

import java.util.List;

import com.fortna.book.model.Book;
import com.fortna.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping("/")
	public String getAllBooks() {
		System.out.print("hyhy");
		List<Book> listOfBooks = bookService.getAllBooks();
		return listOfBooks.toString();
	}

}
