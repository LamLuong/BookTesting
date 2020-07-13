package com.fortna.book.graphql;

import java.util.List;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.fortna.book.model.Book;
import com.fortna.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookQuery implements GraphQLQueryResolver {
  @Autowired
  private BookService bookService;
  public List<Book> books() {
      return this.bookService.getAllBooks();
  }
  public Book book(final int id) {
      return this.bookService.getBook(id);
  }
}
