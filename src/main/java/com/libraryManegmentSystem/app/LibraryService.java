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
        book.setAvailable(false);
    }

}
