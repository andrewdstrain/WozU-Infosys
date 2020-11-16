package com.wozu.lab.a.grocery_cart.models;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GroceryCartTest {
    private static GroceryCart cart;

    @BeforeAll
    static void beforeAll() {
        cart = new GroceryCart();
    }

    @Test
    @Order(2)
    void getItems() {
        String expectedName = "honeycrisp apple";
        int expectedQty = 2;
        double expectedPrice = 999.00;

        String actualName = cart.getItems().get(0).getName();
        int actualQty = cart.getItems().get(1).getQuantity();
        double actualPrice = cart.getItems().get(2).getPrice();

        assertEquals(expectedName, actualName);
        assertEquals(expectedQty, actualQty);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    @Order(1)
    void setItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("honeycrisp apple", 3, 2.35));
        items.add(new Item("granny smith apple", 2, 1.99));
        items.add(new Item("macintosh apple", 1, 999.00));

        cart.setItems(items);
        List<Item> expected = items;
        List<Item> actual = cart.getItems();

        assertNotNull(actual);
        assertEquals(expected, actual);
        assertEquals(3, actual.size());
    }
}