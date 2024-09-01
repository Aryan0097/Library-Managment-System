package com.libraryManegmentSystem.app;

import java.util.List;
import java.util.Optional;

public interface BookRepositroy {
	
	public void add(Book book);
	
	public int getTotalBookCount();

	public Optional<Book> findByIsbn(String isbn);

	public List<Book> getAllBooks();
}
