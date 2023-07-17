package com.subrutin.catalog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.subrutin.catalog.dto.BookDetailDTO;
import com.subrutin.catalog.service.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BookResources {

	private final BookService bookService; // Layanan untuk mengakses data buku

	@GetMapping("/book/{bookId}")
	public BookDetailDTO findBookDetail(@PathVariable("bookId") Long id) {
		// Menggunakan layanan bookService untuk mencari detail buku berdasarkan ID yang
		// diberikan
		return bookService.findBookDetailById(id);
	}
}

//Tentu! Berikut adalah penjelasan tentang anotasi `@AllArgsConstructor` dan `@RestController`:
//
//1. Anotasi `@AllArgsConstructor`: Anotasi ini berasal dari Lombok dan digunakan pada kelas untuk menghasilkan konstruktor dengan parameter untuk semua properti dalam kelas tersebut. Dalam konteks kelas `BookResources`, anotasi `@AllArgsConstructor` digunakan untuk menghasilkan konstruktor dengan parameter `BookService` yang disediakan oleh Lombok secara otomatis. Dengan adanya anotasi ini, kita tidak perlu menulis konstruktor secara manual.
//
//2. Anotasi `@RestController`: Anotasi ini berasal dari Spring Framework dan digunakan pada kelas untuk menandai bahwa kelas tersebut adalah komponen kontroler REST. Dalam konteks kelas `BookResources`, anotasi `@RestController` digunakan untuk memberi tahu Spring bahwa kelas ini adalah komponen kontroler yang akan menangani permintaan REST dari klien. Dengan menandai kelas sebagai `@RestController`, kita dapat mendefinisikan metode-metode yang akan digunakan sebagai endpoint REST dan mengembalikan data dalam format yang sesuai untuk respons.
//
//Dalam kode yang diberikan, anotasi `@AllArgsConstructor` digunakan untuk menyediakan konstruktor dengan parameter `BookService` yang digunakan untuk menginisialisasi properti `bookService` pada kelas `BookResources`. Selanjutnya, anotasi `@RestController` digunakan untuk menandai kelas sebagai komponen kontroler REST yang akan menangani permintaan terkait buku.