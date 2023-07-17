package com.subrutin.catalog.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -493967282312085855L;

	private Long id;               // ID buku
	
	private String title;          // Judul buku
	
	private String description;    // Deskripsi buku
	
	private Author author;         // Penulis buku
	
	// Implementasi interface Serializable memungkinkan objek Book
	// dapat diserialisasi, yaitu dikonversi menjadi bentuk yang dapat
	// disimpan atau ditransmisikan melalui jaringan.
}
