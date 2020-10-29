package com.isageek.blaztek.day14.laba;

import com.isageek.blaztek.day14.laba.model.Book;
import com.isageek.blaztek.day14.laba.repo.BookRepo;
import com.isageek.blaztek.day14.laba.service.BookService;
import com.isageek.blaztek.day14.laba.service.BookServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {BookServiceImpl.class})
@DisplayName("andy")
class LabAApplicationTests {
    @Autowired
    BookServiceImpl bookService;

    @MockBean
    BookRepo bookRepo;

    @BeforeEach
    void beforeEach() {
        Book book = new Book("Jack and Jill", 2003, "James Patterson", 480, "Little, Brown and Company");
        List<Book> books = new ArrayList<>();
        books.add(book);

        Mockito.when(bookRepo.findAll()).thenReturn(books);
        Mockito.when(bookRepo.findById(1L).get()).thenReturn(book);
        Mockito.when(bookRepo.save(book)).thenReturn(book);
        Mockito.doNothing().when(bookRepo).deleteById(1L);
    }

    @Test
    void crud() {
        Book book = new Book("Jack and Jill", 2003, "James Patterson", 480, "Little, Brown and Company");
        book = bookService.create(book);

        Book foundBook = bookService.read(1L);
        assertEquals(book.getTitle(), foundBook.getTitle());
        assertEquals(book.getYear(), foundBook.getYear());

        bookService.delete(book.getId());
    }

}
