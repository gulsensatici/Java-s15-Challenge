package com.workintech.main;

import com.workintech.library.Library;
import com.workintech.model.Book;
import com.workintech.model.MemberRecord;
import com.workintech.users.Employee;

import java.util.Scanner;

import static com.workintech.model.Type.NOVEL;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();
    private static MemberRecord member;
    public static void main(String[] args) {
       System.out.println("kütüphanemize hoşgeldiniz.");
        Employee employee=new Employee("Admin", "şifre");
        Book book = new Book("Yaşamak","Yu Hua", 1, 60,false, NOVEL);
        System.out.println(book);
    }


}