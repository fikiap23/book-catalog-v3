package com.subrutin.catalog.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subrutin.catalog.domain.Author;
import com.subrutin.catalog.domain.Book;
import com.subrutin.catalog.repository.BookRepository;
import com.subrutin.catalog.repository.impl.BookRepositoryImpl;

@Configuration
public class AppConfig {
	
//	@Bean
//	public Author author() {
//		// Membuat instance dari kelas Author dengan nilai-nilai yang ditentukan
//		return new Author(1L, "Fiki Aprian", null,false);
//	}
//	
//	@Bean
//	public Book book1(Author author) {
//		// Membuat instance dari kelas Book dengan nilai-nilai yang ditentukan
//		Book book = new Book();
//		book.setId(1L);
//		book.setTitle("Coding bro");
//		book.setDescription("Buku Tentang coding seru");
//		book.setAuthor(author);
//		return book;
//	}
//	
//	@Bean
//	public Book book2(Author author) {
//		// Membuat instance lain dari kelas Book dengan nilai-nilai yang berbeda
//		Book book = new Book();
//		book.setId(2L);
//		book.setTitle("Coding bro v2");
//		book.setDescription("Buku Tentang coding seru v2");
//		book.setAuthor(author);
//		return book;
//	}
//	
//	@Bean
//	public BookRepository bookRepository(Book book1, Book book2) {
//		// Membuat Map untuk menyimpan buku-buku dengan ID mereka sebagai kunci
//		Map<Long, Book> bookMap = new HashMap<>();
//		bookMap.put(1L, book1);
//		bookMap.put(2L, book2);
//		
//		// Membuat instance dari kelas BookRepositoryImpl
//		// dan mengatur bookMap sebagai sumber datanya
//		BookRepositoryImpl bookRepository = new BookRepositoryImpl();
//		bookRepository.setBookMap(bookMap);
//		return bookRepository;
//	}
}
