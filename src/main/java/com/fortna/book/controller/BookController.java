package com.fortna.book.controller;

import java.util.List;

import com.fortna.book.model.Book;
import com.fortna.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.gson.*;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value="/getAllBooks", method = RequestMethod.GET)
	public String getAllBooks() {
		List<Book> listOfBooks = bookService.getAllBooks();
		String json = new Gson().toJson(listOfBooks );
		return json;
	}

	@RequestMapping(value="/getBook/{id}", method = RequestMethod.GET)
	public String getaBook(@PathVariable int id) {
		Book a_book = bookService.getBook(id);
		String json = new Gson().toJson(a_book);
		return json;
	}

}
