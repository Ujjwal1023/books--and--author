package com.example.books.and.author;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Service {
Repository repository=new Repository();


    public Book addBook(Book book) {
        String authorName = book.getAuthorName();
        Author author=repository.findauthorbyname(authorName);
        List<Book>bookList=repository.getList(author);
        bookList.add(book);
        repository.update(author,bookList);
        return repository.addBook(book);
    }

    public String addAuthor(Author author) {
        repository.addAuthor(author);
        return "Author has been added successfully";
    }

    public String updatePages(int pages, int id) {
        Book book=repository.findbook(id);
        book.setPageNo(pages);
        return "Pages have been updated successfully";

    }

    public Book getbook(int id) {
        return repository.findbook(id);
    }

    public List<Book> getAllBooks(String authorName) {
        Author author =repository.findauthorbyname(authorName);
        return repository.getList(author);
    }
}
