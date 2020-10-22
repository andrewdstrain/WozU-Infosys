package com.isageek.blaztek.day14.laba.controller;

import com.isageek.blaztek.day14.laba.model.Book;
import com.isageek.blaztek.day14.laba.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {
    final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/post/book")
    public Book createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping("/get/book")
    public Iterable<Book> readBooks() {
        return bookService.reads();
    }

    @GetMapping("/get/book/{id}")
    public Book readBook(@PathVariable Long id) {
        return bookService.read(id);
    }

    @PutMapping("/put/book/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        return bookService.update(book, id);
    }

    @DeleteMapping("/delete/book/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }
}
