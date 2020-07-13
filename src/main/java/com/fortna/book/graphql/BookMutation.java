package com.fortna.book.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import com.fortna.book.model.Book;
import com.fortna.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class BookMutation implements GraphQLMutationResolver {
  @Autowired
  private BookService bookService;
  public Book createBook(final String title, final String author,
    final String description, final String published_date) {
      Book a_book = new Book();
      a_book.setTitle(title);
      a_book.setAuthor(author);
      a_book.setDescription(description);

      return this.bookService.addBook(a_book);
  }
}
