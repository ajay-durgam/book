package com.edubridge.book.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Hello world!
 *
 */
@Entity
public class Book
{
	@Id
   private int id;
   private String name;
   
   private String author;
   
   private float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
}
   


   
}
