package com.fortna.book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fortna.book.model.Book;
// import com.fortna.book.service.BookService;
// import com.fortna.book.dao.BookDao;

@SpringBootApplication
public class BookApplication {

	// @Bean
	// public SessionFactory sessionFactory(HibernateUtils hemf){
	//     return hemf.getSessionFactory();
	// }

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BookApplication.class, args);
		//
		// SessionFactory factory = HibernateUtils.getSessionFactory();
		//
		// Session session = factory.openSession();
		// Transaction transaction = null;
		//
		// try {
		// 	String jpql = "Select e from " + Book.class.getName() + " e ";
		// 	List <Book> books = session.createQuery(jpql).list();
		// 	for (Iterator iterator = books.iterator(); iterator.hasNext();) {
		// 		Book bookk = (Book) iterator.next();
		// 		System.out.print("First Name: " + bookk.getTitle());
		// 	}
		// } catch (HibernateException e) {
		// 	if (transaction != null) {
    //     transaction.rollback();
    //   }
		// } finally {
		// 	session.close();
		// }

	}
}
