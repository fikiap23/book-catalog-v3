package com.subrutin.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

	private Long id; // ID penulis

	private String name; // Nama penulis

	private Long birthDate; // Tanggal lahir penulis

	// Konstruktor dengan menggunakan lombok annotation @AllArgsConstructor
	// untuk menginisialisasi semua properti objek Author
}
