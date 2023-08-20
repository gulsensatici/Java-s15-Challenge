package com.workintech.main;

import com.workintech.library.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Library library = new Library("gulsn satici", "xxxxxxxxxx", "baba ve piç");
        //System.out.println(library);
        Library library =new Library();
        library.setMembers();
    }
}