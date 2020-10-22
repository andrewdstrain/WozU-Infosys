package com.isageek.blaztek.day14.laba.service;

import com.isageek.blaztek.day14.laba.model.Book;

public interface BookService {

    Book create(Book book);

    Book read(Long id);

    Iterable<Book> reads();

    Book update(Book book, Long id);

    void delete(Long id);
}
