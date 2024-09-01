package com.libraryManegmentSystem.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	void testBook() {
		Book book = new Book("123456789","Refactoring","Robert C. Martin",2008);
		
		assertTrue(book.getIsbn().equals("123456789"));
		assertTrue(book.getTitle().equals("Refactoring"));
		assertTrue(book.getAuthor().equals("Robert C. Martin"));
		assertEquals(2008, book.getPublishedYear());
		assertTrue(book.isAvailable());
	}

}
