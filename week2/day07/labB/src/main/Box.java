package main;

import java.util.HashMap;
import java.util.Map;

/**
 * A generic box that can hold only on type of items. For example, a box of strawberries or a box of chocolates.
 */
public class Box<T> {
    private final Map<String, T> items;

    public Box() {
        items = new HashMap<>();
    }

    /**
     * Put an item in the box.
     *
     * @param name the name of the item
     * @param item the item that goes in the box
     */
    public void put(String name, T item) {
        items.put(name, item);
    }

    /**
     * Take an item out of the box.
     *
     * @param name name of the item
     * @return the item that was put into the box
     */
    public T take(String name) {
        return items.remove(name);
    }

    /**
     * Is there anything in the box?
     *
     * @return true if the box is empty, otherwise false
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * How many items are in the box?
     *
     * @return the number of items in the box
     */
    public int getNumberOfItems() {
        return items.size();
    }
}
