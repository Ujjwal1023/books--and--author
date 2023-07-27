package com.example.books.and.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List; 


@RestController
@RequestMapping("/controller")
public class Controller {

    @Autowired
    Service service;
    @PostMapping("/Addbook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book result=service.addBook(book);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
    @PostMapping("/addAuthor")
    public ResponseEntity<String>addAuthor(@RequestBody Author author){
        String result=service.addAuthor(author);
        return new ResponseEntity<>(result,HttpStatus.ACCEPTED);
    }
    @PutMapping("/updatepage")
    public ResponseEntity<String>updatePages(@RequestParam int pages,@RequestParam int id){
        String result=service.updatePages(pages,id);
        return new ResponseEntity<String>(result,HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public  Book getbook(@RequestParam("ujju") int id){
        return service.getbook(id);
    }

    @GetMapping("/getBooks")
    public List<Book> getAllBooks(@RequestParam String authorName){
        return service.getAllBooks(authorName);
    }

}
