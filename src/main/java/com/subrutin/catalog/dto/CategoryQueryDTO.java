package com.subrutin.catalog.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategoryQueryDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9053276636307946083L;

	private Long bookId;
	
	private String categoryCode;
}
