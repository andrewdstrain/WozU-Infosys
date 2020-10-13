package test;

import main.Box;
import main.Candy;
import main.Ghost;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Box Tests")
public class BoxTests {
    @Test
    void ghosts() {
        Ghost blinky = new Ghost("Shadow", "Blinky", "red");
        Ghost pinky = new Ghost("Speedy", "Pinky", "pink");
        Ghost inky = new Ghost("Bashful", "Inky", "cyan");
        Ghost clyde = new Ghost("Pokey", "Clyde", "orange");

        Box<Ghost> box = new Box<>();
        assertTrue(box.isEmpty());

        box.put("bGhost", blinky);
        assertEquals(1, box.getNumberOfItems());

        box.put("pGhost", pinky);
        assertEquals(2, box.getNumberOfItems());

        box.put("iGhost", inky);
        assertEquals(3, box.getNumberOfItems());

        box.put("cGhost", clyde);
        assertEquals(4, box.getNumberOfItems());

        Ghost picked = box.take("pGhost");
        assertEquals(3, box.getNumberOfItems());
        assertEquals("Speedy", picked.getName());

        picked = box.take("cGhost");
        assertEquals(2, box.getNumberOfItems());
        assertEquals("Pokey", picked.getName());

        picked = box.take("bGhost");
        assertEquals(1, box.getNumberOfItems());
        assertEquals("Shadow", picked.getName());

        picked = box.take("iGhost");
        assertEquals(0, box.getNumberOfItems());
        assertTrue(box.isEmpty());
        assertEquals("Bashful", picked.getName());

    }

    @Test
    void candies() {
        Candy mike = new Candy("Mike and Ike", 25);
        Candy kiss = new Candy("Hershey's Kisses", 42);
        Candy hot = new Candy("Red Hots", 100);

        Box<Candy> box = new Box<>();

        assertTrue(box.isEmpty());

        box.put("mike", mike);
        assertEquals(1, box.getNumberOfItems());
        box.put("kiss", kiss);
        assertEquals(2, box.getNumberOfItems());
        box.put("hot", hot);
        assertEquals(3, box.getNumberOfItems());

        Candy picked = box.take("kiss");
        assertEquals(2, box.getNumberOfItems());
        assertEquals(42, picked.getQuantity());

        picked = box.take("kiss");
        assertEquals(null, picked);

        picked = box.take("mike");
        assertEquals(1, box.getNumberOfItems());
        assertEquals(25, picked.getQuantity());

        picked = box.take("hot");
        assertEquals(0, box.getNumberOfItems());
        assertTrue(box.isEmpty());
        assertEquals(100, picked.getQuantity());
    }
}
