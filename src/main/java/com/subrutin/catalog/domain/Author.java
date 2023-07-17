package com.subrutin.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author {

	private Long id; // ID penulis

	private String name; // Nama penulis

	private Long birthDate; // Tanggal lahir penulis

	// Konstruktor dengan menggunakan lombok annotation @AllArgsConstructor
	// untuk menginisialisasi semua properti objek Author
}

//Anotasi @Data: Anotasi ini digunakan untuk secara otomatis menghasilkan boilerplate code yang umum digunakan dalam kelas Java, seperti getter, setter, equals(), hashCode(), dan toString(). Dengan menggunakan anotasi @Data, kita tidak perlu menulis kode boilerplate tersebut secara manual, Lombok akan menghasilkannya secara otomatis.
//
//Anotasi @AllArgsConstructor: Anotasi ini digunakan untuk menghasilkan konstruktor dengan parameter untuk semua properti di dalam kelas. Dalam kasus ini, anotasi @AllArgsConstructor digunakan untuk menghasilkan konstruktor yang menerima tiga parameter, yaitu id, name, dan birthDate, dan menginisialisasi properti kelas Author dengan nilai-nilai dari parameter yang diterima.
