package com.subrutin.catalog.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDetailDTO implements Serializable {
	
	private static final long serialVersionUID = -7889938648939242355L;

	private Long bookId;               // ID buku
	
	private String authorName;         // Nama penulis buku
	
	private String bookTitle;          // Judul buku
	
	private String bookDescription;    // Deskripsi buku

	// Implementasi interface Serializable memungkinkan objek BookDetailDTO
	// dapat diserialisasi, yaitu dikonversi menjadi bentuk yang dapat
	// disimpan atau ditransmisikan melalui jaringan.
}
