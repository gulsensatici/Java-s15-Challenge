package com.workintech.users;

import com.workintech.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    private List<Book> books;

    public Author(String name, List<Book> books) {
        super(name);
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void whoYouAre() {
        System.out.println(" adında bir yazarım " + name);
    }

}
