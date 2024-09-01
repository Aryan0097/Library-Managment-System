package com.libraryManegmentSystem.app;

import java.util.Optional;

public interface BookRepositroy {
	
	public void add(Book book);
	
	public int getTotalBookCount();

	public Optional<Book> findByIsbn(String isbn);
}
