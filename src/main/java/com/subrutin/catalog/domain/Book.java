package com.subrutin.catalog.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -493967282312085855L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;               // ID buku
	
	@Column(name = "title" , nullable = false)
	private String title;          // Judul buku
	
	@Column(name = "description", nullable = true)
	private String description;    // Deskripsi buku
	
	@ManyToOne
	@JoinColumn(name = "publisher_id",nullable = false)
	private Publisher publisher;
	
	// Implementasi interface Serializable memungkinkan objek Book
	// dapat diserialisasi, yaitu dikonversi menjadi bentuk yang dapat
	// disimpan atau ditransmisikan melalui jaringan.
}
