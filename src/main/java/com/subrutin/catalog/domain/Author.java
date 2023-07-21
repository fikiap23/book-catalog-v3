package com.subrutin.catalog.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
public class Author {

	//strategy yg palim umum digunakan untuk generatedValue
	// GenerationType.SEQUENCE -> pros: enable batch insert
	//GenerationType.IDENTITY -> cons: batch insert disabled
	//IDENTITY agar bisa batch insert -> stored producured
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; // ID penulis(PK)

	@Column(name = "author_name",nullable = false, columnDefinition = "varchar(300)")
	private String name; // Nama penulis

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate; // Tanggal lahir penulis


}
