package com.hcl.hibernatepractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hibernatepractise.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
