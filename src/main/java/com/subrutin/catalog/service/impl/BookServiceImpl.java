package com.subrutin.catalog.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.subrutin.catalog.domain.Author;
import com.subrutin.catalog.domain.Book;
import com.subrutin.catalog.dto.BookCreateDTO;
import com.subrutin.catalog.dto.BookDetailDTO;
import com.subrutin.catalog.dto.BookUpdateRequestDTO;
import com.subrutin.catalog.repository.BookRepository;
import com.subrutin.catalog.service.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("bookService")
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository; // Repository untuk akses data buku

	@Override
	public BookDetailDTO findBookDetailById(Long bookId) {
		Book book = bookRepository.findBookById(bookId); // Mengambil data buku dari repository berdasarkan ID
		BookDetailDTO dto = new BookDetailDTO(); // Membuat objek DTO baru untuk menyimpan detail buku
		dto.setBookId(book.getId()); // Mengisi properti DTO dengan nilai-nilai yang sesuai dari objek Book
		dto.setAuthorName(book.getAuthor().getName());
		dto.setBookTitle(book.getTitle());
		dto.setBookDescription(book.getDescription());
		return dto; // Mengembalikan objek DTO dengan detail buku
	}

	@Override
	public List<BookDetailDTO> findBookListDetail() {
		List<Book> books = bookRepository.findAll(); // Mengambil semua buku dari repository

		// Mengonversi setiap objek Book menjadi objek BookDetailDTO
		return books.stream().map((b) -> {
			BookDetailDTO dto = new BookDetailDTO(); // Membuat objek BookDetailDTO baru

			// Mengisi informasi buku ke dalam objek BookDetailDTO
			dto.setAuthorName(b.getAuthor().getName()); // Mengatur nama penulis buku
			dto.setBookDescription(b.getDescription()); // Mengatur deskripsi buku
			dto.setBookId(b.getId()); // Mengatur ID buku
			dto.setBookTitle(b.getTitle()); // Mengatur judul buku

			return dto; // Mengembalikan objek BookDetailDTO yang telah diisi
		}).collect(Collectors.toList()); // Mengumpulkan objek BookDetailDTO menjadi List
	}

	@Override
	public void createNewBook(BookCreateDTO dto) {
		Author author = new Author();
		author.setName(dto.getAuthorName());

		Book book = new Book();
		book.setAuthor(author);
		book.setTitle(dto.getBookTitle());
		book.setDescription(dto.getDescription());
		bookRepository.save(book);

	}

	@Override
	public void updateBook(Long bookId, BookUpdateRequestDTO dto) {
//		get book from repository
		Book book = bookRepository.findBookById(bookId);
//		update
		book.setTitle(dto.getBookTitle());
		book.setDescription(dto.getDescription());
//		save
		bookRepository.update(book);

	}

	@Override
	public void deleteBook(Long BookId) {
		bookRepository.delete(BookId);
	}

}
