package com.edubridge.book.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.spi.Configurable;

import com.edubridge.book.model.Book;

public class BookMain {
	public static void main(String[] args) {
		
	
	String cfgFile = "/com/edubridge/book/cfg/book.cfg.xml";
	
	Book b = new Book();
	b.setId(100);
	
	b.setName("It Ends Vth Us");
	
	b.setAuthor("hoover");
	
	b.setPrice(600f);
	
    Configuration con = new Configuration().configure(cfgFile);
    //con.configure(cfgFile);
    
    SessionFactory factory = con.buildSessionFactory();
    
    Session sn = factory.openSession();
    
    Transaction tx = sn.beginTransaction();
    
    try {
		sn.save(b);
		tx.commit();
		System.out.println("Success");
	} catch (Exception e) {
		// TODO: handle exception
		tx.rollback();
		System.out.println(e);
		System.out.println("Failed");
	}
	

	}
}
