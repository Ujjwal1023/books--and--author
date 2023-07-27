package com.example.books.and.author;

import lombok.Data;

public class Book {
    private int Id;
    private String name;
    private int pageNo;
    private int yearOfPub;
    private String authorName;

    public Book() {
    }

    public Book(int id, String name, int pageNo, int yearOfPub, String authorName) {
        Id = id;
        this.name = name;
        this.pageNo = pageNo;
        this.yearOfPub = yearOfPub;
        this.authorName = authorName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
