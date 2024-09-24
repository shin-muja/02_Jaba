package com.hw3.medel.dto;

public class Book {
	private int bookNumber;
	private String name;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNumber, String name, String author, int price, String publisher) {
		super();
		this.bookNumber = bookNumber;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return String.format("%d번 도서 : [도서과목 : %s / 도서저자 : %s / 도서가격 : %d원 / 출판사 : %s]", bookNumber, name, author, price, publisher);
	}
	
	
}
