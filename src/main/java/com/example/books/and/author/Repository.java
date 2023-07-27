package com.example.books.and.author;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repository {
    private HashMap<Integer,Book>bookData=new HashMap<>();
    private HashMap<String,Author>AuthorData=new HashMap<>();
    private HashMap<Author, List<Book>>AuthorList=new HashMap<>();

    public Book addBook(Book book) {
        Integer id=book.getId();
        bookData.put(id,book);
        return bookData.get(id);

    }

    public void addAuthor(Author author) {
        String name=author.getName();
        AuthorData.put(name,author);
    }

    public Book findbook(int id) {
        return bookData.get(id);
    }

    public Author findauthorbyname(String authorName) {
        return AuthorData.get(authorName);
    }

    public List<Book> getList(Author author) {
        if(AuthorList.containsKey(author)){
            return AuthorList.get(author);
        }
        return new ArrayList<>();

    }

    public void update(Author author, List<Book> bookList) {
        AuthorList.put(author,bookList);
    }
}


