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

}
