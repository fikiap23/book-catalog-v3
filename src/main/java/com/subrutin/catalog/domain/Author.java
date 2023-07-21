package com.subrutin.catalog.domain;

import java.time.LocalDate;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
//@DynamicUpdate //gunakan saat kolomnya banyak, biar kalau update cuma kolom yg berubah yg diset
@SQLDelete(sql = "UPDATE author SET deleted = true WHERE id = ?")
@Where(clause = "deleted=false")
public class Author {

	//strategy yg palim umum digunakan untuk generatedValue
	// GenerationType.SEQUENCE -> pros: enable batch insert
	//GenerationType.IDENTITY -> cons: batch insert disabled
	//IDENTITY agar bisa batch insert -> stored producured
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "author_generator", sequenceName = "author_id_seq") //gunakan saat ada lebih satu tabel
	private Long id; // ID penulis(PK)

	@Column(name = "author_name",nullable = false, columnDefinition = "varchar(300)")
	private String name; // Nama penulis

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate; // Tanggal lahir penulis
	
	@Column(name = "deleted", columnDefinition = "boolean default false")
	private Boolean deleted;


}
