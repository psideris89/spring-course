package com.demo.springdemo.service;

import com.demo.springdemo.model.Book;
import com.demo.springdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }

    public Book findById(Integer id)
    {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(new Book(10, "ABc", "Kappa"));
    }
}
