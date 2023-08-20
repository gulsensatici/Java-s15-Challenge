package com.workintech.users;



public class Employee extends Person{
    private String password;

    public Employee(String name, String password) {
        super(name);
        this.password = password;
    }


    @Override
    public void whoYouAre() {
        System.out.println("Ben" + name + "isimli çalışanım");
    }
}
