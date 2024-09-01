package com.libraryManegmentSystem.app;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int publishedYear;
	private boolean isAvailable;
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public Book(String isbn, String title, String author, int publishedYear) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
		this.isAvailable = true;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	
	
	
	
}
