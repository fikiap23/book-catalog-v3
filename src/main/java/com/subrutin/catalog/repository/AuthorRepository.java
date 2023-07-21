package com.subrutin.catalog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrutin.catalog.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
	
	//method name convention
	//docs: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	//find+keyword
	//sql -> select * from Author a where a.id= :authorId
	public Optional<Author> findById(Long id);
	
	//sql -> select a from Author a where a.author_name LIKE : authorName
	public List<Author> findByNameLike(String authorName);
	
	public Optional<Author> findByIdAndDeletedFalse(Long id);
 
}
