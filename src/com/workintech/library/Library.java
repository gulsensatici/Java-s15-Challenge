package com.workintech.library;


import com.workintech.model.MemberRecord;
import com.workintech.model.Book;

import java.util.*;


public class Library {
    private List<Book> books = new ArrayList<>();
    private static Map<String, MemberRecord> members = new HashMap<>();


    public Library() {
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

    public void takeBackBook(String bookTitle, String memberName) {
        Book book = findBookByTitle(bookTitle);
        MemberRecord member = getMembers(memberName);

        if(book != null && member !=null && book.isAvailable()){
            book.isAvailable();
            System.out.println(bookTitle + " "+ memberName + " isimli üye tarafından geri verildi.");
        }else {
            System.out.println("Hatalı işlem.");
        }

    }

    private MemberRecord getMembers(String memberName) {
        return members.get(memberName);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }
}
