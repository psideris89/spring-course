package com.demo.springdemo.controller;

import com.demo.springdemo.model.Book;
import com.demo.springdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks()
    {
        List<Book> books = bookService.findAll();
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBooks(@PathVariable Integer id)
    {
        Book book = bookService.findById(id);
        return book;
    }

     // SAve a book

     // Find Books that have id Greater than 1 and less than 5
}
