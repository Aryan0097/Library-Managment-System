package com.libraryManegmentSystem.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibraryTest {

	
	//verify book is added
	@Test
	void testBookAdd() {
		int bookCount = library.getTotalBookCount();
		Book book = new Book("123456789","Refactoring","Robert C. Martin",2008);
		
		//add book into library
		library.addBook(book);
		
		//verify book count to check book is added
		assertEquals(bookCount, library.gettotalBookCount());
	}

}
