package com.workintech.users;

import com.workintech.library.Library;
import com.workintech.model.Book;

import java.util.List;
import java.util.Scanner;


public class Member extends Person {
    private static Scanner scanner;
   private static Library library; // static??
    private List<Book> borrowedBooks;

    public Member(String name, List<Book> borrowedBooks) {
        super(name);
        this.borrowedBooks = borrowedBooks;
    }

   public void borrowBook(){

   }
    public void returnBook(Book book){
        borrowedBooks.add(book);
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Set<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);

    }

    public void put(String name, Member member) {
    }

    @Override
    public void whoYouAre() {
        System.out.println("Ben bir üyeyim: " + getName());
    }
}
