package com.wozu.lab.a.grocery_cart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GroceryCart {
    private String id;
    private List<Item> items;

    public GroceryCart(List<Item> items) {
        this.items = items;
    }

    public GroceryCart() {
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public String getId() {
        return id;
    }

    @OneToMany
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
