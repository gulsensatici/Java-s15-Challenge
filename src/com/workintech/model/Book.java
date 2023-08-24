package com.workintech.model;

import java.util.Objects;

public class Book {
    private Type type;
    private String title;
    private String author;
    private int id;
    private double price;
    private boolean available;


    public Book( String title, String author, int id, double price, boolean available, Type type ) {
        this.title = title;
        this.type=type;
        this.author = author;
        this.id = id;
        this.price = price;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private boolean returnBook(){
        return true;
    }

    public boolean isAvailable() {
        return true;
    }

    public void display() {
        System.out.println("Kitap Id: " + id );
        System.out.println("Kitap adı: " + title);
        System.out.println("Yazar adı: "+ author);
        System.out.println("Fiyat: "+ price);
        System.out.println("Durum: " + available);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Double.compare(book.price, price) == 0 && available == book.available && type == book.type && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, author, id, price, available);
    }
}
