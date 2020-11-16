package com.wozu.lab.a.grocery_cart.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Item Tests")
class ItemTest {
    private Item item;

    @BeforeEach
    public void beforeEach() {
        item = new Item("honeycrisp apple", 2, 1.99);
    }

    @Test
    void getName() {
        String expected = "honeycrisp apple";
        String actual = item.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setName() {
        item.setName("macintosh apple");
        String expected = "macintosh apple";
        String actual = item.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getQuantity() {
        int expected = 2;
        int actual = item.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    void setQuantity() {
        item.setQuantity(3);
        int expected = 3;
        int actual = item.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    void getPrice() {
        double expected = 1.99;
        double actual = item.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void setPrice() {
        item.setPrice(2.49);
        double expected = 2.49;
        double actual = item.getPrice();
        assertEquals(expected, actual);
    }
}