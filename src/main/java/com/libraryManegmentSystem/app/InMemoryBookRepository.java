package com.libraryManegmentSystem.app;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepositroy {

	private List<Book> books = new ArrayList<>();
	
	public void add(Book book) {
		books.add(book);
	}

	public int getTotalBookCount() {
		return books.size();
	}

}
