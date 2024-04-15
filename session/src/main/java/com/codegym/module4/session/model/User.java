package com.codegym.module4.session.model;

public class User {
    private int count;

    public User() {
    }

    public User(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }
}
