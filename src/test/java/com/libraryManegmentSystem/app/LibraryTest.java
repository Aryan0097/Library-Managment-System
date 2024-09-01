package com.libraryManegmentSystem.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {

	private Library library;
	private BookRepositroy bookRepository;

	@BeforeEach
	public void init() {
		bookRepository = new InMemoryBookRepository();
		library = new LibraryService(bookRepository);
	}

	// verify book is added
	@Test
	void testBookAdd() {
		int bookCount = library.getTotalBookCount();
		Book book = new Book("123456789", "Refactoring", "Robert C. Martin", 2008);

		// add book into library
		library.addBook(book);

		// verify book count to check book is added
		assertEquals(bookCount + 1, library.getTotalBookCount());
	}

	// verify book is brrowed
	@Test
	void testBookBorrow() throws BookNotAvailableException  {
		Book book = new Book("123456789", "Refactoring", "Robert C. Martin", 2008);

		// add book into library
		library.addBook(book);
		
		//borrow book
		library.borrowBook(book.getIsbn());
		
		// verify book is borrowed
		assertFalse(book.isAvailable());
	}
	
	// verify book is returned
	@Test
	public void testReturnBook() {
	    Book book = new Book("74125598963", "Title", "Author", 2021);
	    
	    //add book in library
	    library.addBook(book);
	    
	    //borrow book from library
	    library.borrowBook(book.getIsbn());
	    
	    //return book to library
	    library.returnBook(book);
	    
	    // verify book is returned
	    assertTrue(book.isAvailable());
	}
	
	// get all available books
	@Test
	public void testViewAvailableBooks() {
	    Book availableBook = new Book("5262364734", "Effective Java", "Joshua Bloch", 2001);
	    Book borrowedBook = new Book("123456789", "Refactoring", "Robert C. Martin", 2008);
	    
	    //add book into library
	    library.addBook(availableBook);
	    library.addBook(borrowedBook);
	    
	    //borrow book from library
	    library.borrowBook(borrowedBook.getIsbn());
	    
	    //get available books
	    List<Book> availableBooks = library.getAvailableBooks();
	    
	    // verify available books
	    assertTrue(availableBooks.contains(availableBook));
	    // verify unavailable books
	    assertFalse(availableBooks.contains(borrowedBook));
	}
	
	@Test
    public void testBorrowBookNotAvailable() {
        assertThrows(BookNotAvailableException.class, () -> {
            library.borrowBook("wrongIsbn");
        });
    }

}
