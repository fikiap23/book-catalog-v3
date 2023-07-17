package com.subrutin.catalog.service.impl;

import org.springframework.stereotype.Service;

import com.subrutin.catalog.domain.Book;
import com.subrutin.catalog.dto.BookDetailDTO;
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
}

//Tentu! Berikut adalah penjelasan tentang anotasi `@AllArgsConstructor` dan `@Service`:
//
//1. Anotasi `@AllArgsConstructor`: Anotasi ini berasal dari Lombok dan digunakan pada kelas untuk menghasilkan konstruktor dengan parameter untuk semua properti dalam kelas tersebut. Dalam konteks kelas `BookServiceImpl`, anotasi `@AllArgsConstructor` digunakan untuk menghasilkan konstruktor dengan parameter `BookRepository` yang disediakan oleh Lombok secara otomatis. Dengan adanya anotasi ini, kita tidak perlu menulis konstruktor secara manual.
//
//2. Anotasi `@Service`: Anotasi ini berasal dari Spring Framework dan digunakan pada kelas untuk menandai bahwa kelas tersebut adalah komponen layanan (service). Dalam konteks kelas `BookServiceImpl`, anotasi `@Service` digunakan untuk memberi tahu Spring bahwa kelas ini adalah komponen layanan yang akan digunakan dalam konteks aplikasi. Dengan menandai kelas sebagai `@Service`, kita dapat menggunakan dependency injection untuk mengakses dan menggunakan komponen ini dalam komponen lain yang membutuhkannya.
//
//Dalam kode yang diberikan, anotasi `@AllArgsConstructor` digunakan untuk menyediakan konstruktor dengan parameter `BookRepository` yang digunakan untuk menginisialisasi properti `bookRepository` pada kelas `BookServiceImpl`. Selanjutnya, anotasi `@Service("bookService")` digunakan untuk menandai kelas sebagai komponen layanan dengan nama "bookService".