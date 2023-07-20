package com.subrutin.catalog.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.subrutin.catalog.domain.Book;
import com.subrutin.catalog.repository.BookRepository;

import lombok.Data;

@Data
public class BookRepositoryImpl implements BookRepository {
	private Map<Long, Book> bookMap;    // Map untuk menyimpan data buku dengan ID sebagai kunci

	@Override
	public Book findBookById(Long id) {
		// Mengambil buku dari map menggunakan ID sebagai kunci
		Book book = bookMap.get(id);
		return book;    // Mengembalikan book
	}

	@Override
	public List<Book> findAll() {
	    List<Book> bookList = new ArrayList<>(bookMap.values()); // Membuat daftar baru dengan nilai dari map
	    
	    return bookList; // Mengembalikan daftar buku
	}

	@Override
	public void save(Book book) {
		int size = bookMap.size();
		book.setId((long) size+1);
		bookMap.put(book.getId(), book);
		
	}

	@Override
	public void update(Book book) {
		bookMap.put(book.getId(), book);
		
	}

}
