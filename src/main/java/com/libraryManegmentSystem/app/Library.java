package com.libraryManegmentSystem.app;

public interface Library {
	
	//method to add Book
	public void addBook(Book book);
	
	//method to get Total book in library
	public int getTotalBookCount();

	public void borrowBook(String isbn) throws BookNotAvailableException ;


}
