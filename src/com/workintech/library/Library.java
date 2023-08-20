package com.workintech.library;


import com.workintech.model.MemberRecord;
import com.workintech.model.Book;
import com.workintech.users.Member;

import java.util.*;


public class Library {
    private List<Book> books = new ArrayList<>();
    private static Map<String, MemberRecord> members = new HashMap<>();


    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public static Map<String, MemberRecord> getMembers() {
        return members;
    }

    public void addBook(Book book) {

        books.add(book.getId(), book);
    }

    public void addMember(MemberRecord memberRecord) {
        members.put(memberRecord.getName(), memberRecord);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println(title + "isimli kitap bulunamadı.");
        return null;
    }

    public void searchBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.display();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    public void lendBook() {
        //ekleme
    }

    public void takeBackBook() {
        //ekleme
    }


}
