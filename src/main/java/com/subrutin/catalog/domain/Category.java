package com.subrutin.catalog.domain;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -6052868310670287516L;
	
	@Id
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description",nullable = true)
	private String description;
	
//	unidirectcional
	@ManyToMany(mappedBy = "categories")
	private List<Book> books;



}
