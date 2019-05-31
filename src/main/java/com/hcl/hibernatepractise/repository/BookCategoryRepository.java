package com.hcl.hibernatepractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hibernatepractise.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {

}
