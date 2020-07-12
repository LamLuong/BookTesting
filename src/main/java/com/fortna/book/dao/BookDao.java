package com.fortna.book.dao;

import java.util.List;

import com.fortna.book.model.Book;
import org.hibernate.SessionFactory;

public interface BookDao {
  public void setSessionFactory(SessionFactory sf);
  public List<Book> getAllBooks() ;

	public Book getBook(int id) ;

	public Book addBook(Book book);

	public void updateBook(Book book) ;

	public void deleteBook(int id) ;
}
