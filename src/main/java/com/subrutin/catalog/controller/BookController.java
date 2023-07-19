package com.subrutin.catalog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.subrutin.catalog.dto.BookCreateDTO;
import com.subrutin.catalog.dto.BookDetailDTO;
import com.subrutin.catalog.service.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/book")
public class BookController {

	private final BookService bookService;

	// Mengambil daftar detail buku dan menampilkannya di halaman daftar buku
	@GetMapping("/list")
	public String findBookList(Model model) {
		List<BookDetailDTO> books = bookService.findBookListDetail();
		model.addAttribute("books", books);
		return "book/list"; // Mengarahkan ke halaman "book/list" untuk menampilkan daftar buku
	}

	// Memuat formulir untuk membuat buku baru
	@GetMapping("/new")
	public String loadBookForm(Model model) {
		BookCreateDTO dto = new BookCreateDTO();
		model.addAttribute("bookCreateDTO", dto); // Menambahkan objek BookCreateDTO ke model sebagai atribut
		return "book/book-new"; // Mengarahkan ke halaman "book/book-new" untuk menampilkan formulir buku baru
	}

	// Menambahkan buku baru berdasarkan data yang dikirimkan melalui formulir
	@PostMapping("/new")
	public String addNewBook(@ModelAttribute("bookCreateDTO") BookCreateDTO dto, Model model) {
		bookService.createNewBook(dto); // Memanggil layanan untuk membuat buku baru berdasarkan DTO yang diberikan
		return "redirect:/book/list"; // Mengalihkan ke halaman daftar buku setelah buku baru ditambahkan
	}

}
