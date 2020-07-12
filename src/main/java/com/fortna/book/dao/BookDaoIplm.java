package com.fortna.book.dao;

import com.fortna.book.model.Book;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.fortna.book.HibernateUtils;
@Repository

public class BookDaoIplm implements BookDao {

//  @Autowired
  private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();;

  public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

  public List<Book> getAllBooks() {
		Session session = this.sessionFactory.openSession();
    String jpql = "Select e from " + Book.class.getName() + " e ";
		List<Book>  bookList = session.createQuery(jpql).list();
    session.close();
		return bookList;
	}

	public Book getBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book book = (Book) session.get(Book.class, id);
		return book;
	}

	public Book addBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(book);
		return book;
	}

	public void updateBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(book);
		session.update(book);
	}

	public void deleteBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book p = (Book) session.load(Book.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}
}
