package com.libraryManegmentSystem.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepositroy {

	private List<Book> books = new ArrayList<>();
	
	@Override
	public void add(Book book) {
		books.add(book);
	}

	@Override
	public int getTotalBookCount() {
		return books.size();
	}

	@Override
	public Optional<Book> findByIsbn(String isbn) {
        return books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst();
    }

}
