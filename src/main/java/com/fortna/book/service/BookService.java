package com.fortna.book.service;

import java.util.List;


import com.fortna.book.model.Book;
import com.fortna.book.dao.BookDao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookService {

  @Autowired
  BookDao bookDao;

  @Transactional
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Transactional
	public Book getBook(int id) {
		return bookDao.getBook(id);
	}

	@Transactional
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Transactional
	public void updateBook(Book book) {
		bookDao.updateBook(book);

	}

	@Transactional
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

}
