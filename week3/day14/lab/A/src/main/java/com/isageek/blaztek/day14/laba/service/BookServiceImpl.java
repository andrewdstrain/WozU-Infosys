package com.isageek.blaztek.day14.laba.service;

import com.isageek.blaztek.day14.laba.model.Book;
import com.isageek.blaztek.day14.laba.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    final BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book read(Long id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public Iterable<Book> reads() {
        return bookRepo.findAll();
    }

    @Override
    public Book update(Book book, Long id) {
        Book newBook = bookRepo.findById(id).get();

        newBook.setTitle(book.getTitle());
        newBook.setYear(book.getYear());
        newBook.setAuthor(book.getAuthor());
        newBook.setPages(book.getPages());
        newBook.setPublisher(book.getPublisher());

        return bookRepo.save(newBook);
    }

    @Override
    public void delete(Long id) {
        bookRepo.deleteById(id);
    }
}
