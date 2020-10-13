package test;

import static org.junit.jupiter.api.Assertions.*;

import MyString.MyString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MyString Tests")
public class MyStringTest {
    @Test
    void test() {
        MyString empty = new MyString();
        MyString chars = new MyString(new char[] {'M', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'B', 'o', 'o', '!'});
        MyString str = new MyString("My name is Boo!");

        assertEquals(new MyString("My name is Boo!"), str);
        assertEquals(new MyString("My name is Boo!"), chars);

        assertEquals("", empty.toString());
        assertEquals("My name is Boo!", str.toString());
        assertEquals("My name is Boo!", new MyString(str).toString());

        assertEquals('M', str.charAt(0));

        assertTrue(new MyString("and").compareTo(new MyString("or")) < 0);
        assertEquals(new MyString("or").compareTo(new MyString("or")), 0);
        assertTrue(new MyString("or").compareTo(new MyString("and")) > 0);

        assertEquals(new MyString("abcxyz"), new MyString("abc").concat(new MyString("xyz")));

        assertTrue(str.contains("Boo"));

        assertTrue(str.endsWith(new MyString("Boo!")));

        assertTrue(new MyString("bOo").equalsIgnoreCase(new MyString("BoO")));

        assertEquals(3, str.indexOf('n'));
        assertEquals(6, str.indexOf('e', 4));
        assertEquals(3, str.indexOf(new MyString("name")));
        assertEquals(11, str.indexOf(new MyString("Boo"), 4));

        assertEquals(0, empty.length());
        assertEquals(15, str.length());
        assertTrue(empty.isEmpty());
        assertFalse(str.isEmpty());

        assertTrue(str.matches(new MyString("^[A-Z].+oo!$")));
        assertFalse(str.matches(new MyString("^[a-z].+oo?$")));

        assertEquals(new MyString("My name is Baa!"), str.replace('o', 'a'));
        assertEquals(new MyString("My name is Bo on the Go!"), str.replace("Boo", "Bo on the Go"));
        assertEquals(new MyString("nomoretears"), new MyString("   no   more tears   ").replaceAll(new MyString(" +"), new MyString()));
        assertEquals(new MyString("no   more tears   "), new MyString("   no   more tears   ").replaceFirst(new MyString(" +"), new MyString()));
    }

    @Test
    void splitTest() {
        assertEquals(6, new MyString("1:2:3:4:5:6").split(new MyString(":")).length);

        MyString[] words = new MyString("1:2:3:4:5:6").split(new MyString(":"));

        assertEquals(new MyString("1"), words[0]);
        assertEquals(new MyString("2"), words[1]);
        assertEquals(new MyString("3"), words[2]);
        assertEquals(new MyString("4"), words[3]);
        assertEquals(new MyString("5"), words[4]);
        assertEquals(new MyString("6"), words[5]);

        /*--------------------------------------*/

        assertEquals(2, new MyString("1:2:3:4:5:6").split(new MyString(":"), 2).length);

        words = new MyString("1:2:3:4:5:6").split(new MyString(":"), 2);

        assertEquals(new MyString("1"), words[0]);
        assertEquals(new MyString("2:3:4:5:6"), words[1]);
    }

    @Test
    void allTheRestTest() {
        MyString str = new MyString("My name is Boo!");

        assertTrue(str.startsWith(new MyString("My ")));
        assertTrue(str.startsWith(new MyString("name "), 3));

        assertEquals(new MyString("name"), str.subSequence(3, 7));

        assertEquals(new MyString("name is Boo!"), str.substring(3));
        assertEquals(new MyString("name"), str.substring(3, 7));

        assertEquals(new MyString("my name is boo!"), str.toLowerCase());
        assertEquals(new MyString("MY NAME IS BOO!"), str.toUpperCase());

        assertEquals(str, new MyString("   My name is Boo!      ").trim());
    }

    @Test
    void staticMethods() {
        assertEquals(new MyString("Boo!"), MyString.copyValueOf(new char[] {'B','o','o','!'}));
        assertEquals(new MyString("oo"), MyString.copyValueOf(new char[] {'B','o','o','!'}, 1,2));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyString.copyValueOf(new char[] {'B','o','o','!'}, 1,4));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyString.copyValueOf(new char[] {'B','o','o','!'}, 4,1));

        assertEquals(new MyString("My name is Boo!"), MyString.join(" ","My", "name", "is", "Boo!"));
        assertEquals(new MyString("My name is Boo!"), MyString.join(" ", new String[] {"My", "name", "is", "Boo!"}));

        assertEquals(new MyString("true"), MyString.valueOf(true));
        assertEquals(new MyString("false"), MyString.valueOf(false));

        assertEquals(new MyString("z"), MyString.valueOf('z'));

        assertEquals(new MyString("Boo!"), MyString.valueOf(new char[] {'B','o','o','!'}));
        assertEquals(new MyString("oo"), MyString.valueOf(new char[] {'B','o','o','!'}, 1,2));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyString.valueOf(new char[] {'B','o','o','!'}, 1,4));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyString.valueOf(new char[] {'B','o','o','!'}, 4,1));

        assertEquals(new MyString("3.14"), MyString.valueOf(3.14));
        assertEquals(new MyString("3.14"), MyString.valueOf(3.14F));

        assertEquals(new MyString("42"), MyString.valueOf(42));
        assertEquals(new MyString("42"), MyString.valueOf(42L));

        assertEquals(new MyString("My name is Boo!"), MyString.valueOf("My name is Boo!"));
        assertEquals(new MyString("3.14"), MyString.valueOf(Float.valueOf(3.14F)));
        assertEquals(new MyString("42"), MyString.valueOf(Integer.valueOf(42)));
    }
}
