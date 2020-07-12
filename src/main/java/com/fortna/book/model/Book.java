package com.fortna.book.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
  @Id
  @Column(name = "book_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name="title")
  private String title;

  @Column(name="author")
  private String author;

  @Column(name="description")
  private String description;

  @Column(name="published_date")
  private String published_date;

  public Book() {
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
