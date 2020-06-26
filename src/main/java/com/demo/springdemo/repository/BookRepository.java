package com.demo.springdemo.repository;

import com.demo.springdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{
    // List<Book> findByAuthor
}

