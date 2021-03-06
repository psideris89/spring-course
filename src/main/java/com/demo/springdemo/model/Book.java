package com.demo.springdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name="book")
public class Book
{
    @Id
    private int id;
    private String title;
    private String author;

    public Book()
    {
    }

    public Book(int id, String title, String author)
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
