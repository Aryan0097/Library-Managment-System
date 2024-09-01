package com.libraryManegmentSystem.app;

public class LibraryService implements Library {

	private final BookRepositroy bookRepository;
	
	public LibraryService(BookRepositroy bookRepositroy) {
		this.bookRepository = bookRepositroy;
	}
	
	@Override
	public void addBook(Book book) {
		bookRepository.add(book);
	}

	@Override
	public int getTotalBookCount() {
		return bookRepository.getTotalBookCount();
	}

	@Override
	public void borrowBook(String isbn) throws BookNotAvailableException {
        Book book = bookRepository.findByIsbn(isbn).orElseThrow(BookNotAvailableException::new);
        if (!book.isAvailable()) {
            throw new BookNotAvailableException();
        }
        
        //setbook as unavailable
        book.setAvailable(false);
    }

	@Override
    public void returnBook(Book book) {
        Book storedBook = bookRepository.findByIsbn(book.getIsbn()).orElseThrow(() -> new RuntimeException("Book not found in repository"));
        
        //set book as available
        storedBook.setAvailable(true);
    }

}
