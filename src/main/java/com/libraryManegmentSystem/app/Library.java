package com.libraryManegmentSystem.app;

public interface Library {
	
	//method to add Book
	public void addBook(Book book);
	
	//method to get Total book in library
	public int getTotalBookCount();

	//method to borrow book
	public void borrowBook(String isbn) throws BookNotAvailableException ;

	//method to return book
	public void returnBook(Book book);


}
