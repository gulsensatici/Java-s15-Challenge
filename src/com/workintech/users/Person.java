package com.workintech.users;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void whoYouAre();

    public String getName() {
        return name;
    }
}
