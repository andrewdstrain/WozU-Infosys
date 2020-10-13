package MyString;

import java.util.Arrays;

public class MyString {
    private final char[] value;

    public MyString() {
        value = new char[0];
    }

    public MyString(char[] chars) {
        value = chars;
    }

    public MyString(String str) {
        value = str.toCharArray();
    }

    public MyString(MyString str) {
        value = str.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyString) {
            MyString str = (MyString) obj;
            return Arrays.equals(value, str.value);
        } else if (obj instanceof String) {
            String str = (String) obj;
            return Arrays.equals(value, str.toCharArray());
        }
        return false;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public char charAt(int index) {
        return value[index];
    }

    public int compareTo(MyString anotherMyString) {
        return toString().compareTo(anotherMyString.toString());
    }

    public MyString concat(MyString str) {
        return new MyString(toString() + str.toString());
    }

    public boolean contains(CharSequence cs) {
        return toString().contains(cs);
    }

    public boolean endsWith(MyString suffix) {
        return toString().endsWith(suffix.toString());
    }

    public boolean equalsIgnoreCase(MyString anotherString) {
        return toString().equalsIgnoreCase(anotherString.toString());
    }

    public int indexOf(int ch) {
        return indexOf(ch, 0);
    }

    public int indexOf(int ch, int fromIndex) {
        return toString().indexOf(ch, fromIndex);
    }

    public int indexOf(MyString str) {
        return indexOf(str, 0);
    }

    public int indexOf(MyString str, int fromIndex) {
        return toString().indexOf(str.toString(), fromIndex);
    }

    public int length() {
        return value.length;
    }

    public boolean isEmpty() {
        return value.length == 0;
    }

    public boolean matches(MyString regex) {
        return toString().matches(regex.toString());
    }

    public MyString replace(char oldChar, char newChar) {
        return new MyString(toString().replace(oldChar, newChar));
    }

    public MyString replace(CharSequence target, CharSequence replacement) {
        return new MyString(toString().replace(target, replacement));
    }

    public MyString replaceAll(MyString regex, MyString replacement) {
        return new MyString(toString().replaceAll(regex.toString(), replacement.toString()));
    }

    public MyString replaceFirst(MyString regex, MyString replacement) {
        return new MyString(toString().replaceFirst(regex.toString(), replacement.toString()));
    }

    public MyString[] split(MyString regex, int limit) {
        String[] words = toString().split(regex.toString(), limit);
        MyString[] myWords = new MyString[words.length];

        for (int i = 0; i < words.length; i++) {
            myWords[i] = new MyString(words[i]);
        }

        return myWords;
    }

    public MyString[] split(MyString regex) {
        return split(regex, 0);
    }

    public boolean startsWith(MyString prefix, int offset) {
        return toString().startsWith(prefix.toString(), offset);
    }

    public boolean startsWith(MyString prefix) {
        return startsWith(prefix, 0);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return toString().subSequence(beginIndex, endIndex);
    }

    public MyString substring(int beginIndex, int endIndex) {
        return new MyString(toString().substring(beginIndex, endIndex));
    }

    public MyString substring(int beginIndex) {
        return substring(beginIndex, toString().length());
    }

    public MyString toLowerCase() {
        return new MyString(toString().toLowerCase());
    }

    public MyString toUpperCase() {
        return new MyString(toString().toUpperCase());
    }

    public MyString trim() {
        return new MyString(toString().trim());
    }

    // Static Methods
    public static MyString copyValueOf(char[] data) {
        return valueOf(data);
    }

    public static MyString copyValueOf(char[] data, int offset, int count) {
        return valueOf(data, offset, count);
    }

    public static MyString join(CharSequence delimiter, CharSequence... elements) {
        return new MyString(String.join(delimiter, elements));
    }

    public static MyString join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return new MyString(String.join(delimiter, elements));
    }

    public static MyString valueOf(boolean b) {
        return new MyString(String.valueOf(b));
    }

    public static MyString valueOf(char c) {
        char[] chars = new char[1];
        chars[0] = c;

        return new MyString(chars);
    }

    public static MyString valueOf(char[] data, int offset, int count) {
        char[] chars = new char[count];

        if (count >= 0) System.arraycopy(data, offset, chars, 0, count);

        return new MyString(chars);
    }

    public static MyString valueOf(char[] data) {
        return valueOf(data, 0, data.length);
    }

    public static MyString valueOf(double d) {
        return new MyString(String.valueOf(d));
    }

    public static MyString valueOf(float f) {
        return new MyString(String.valueOf(f));
    }

    public static MyString valueOf(int i) {
        return new MyString(String.valueOf(i));
    }

    public static MyString valueOf(long l) {
        return new MyString(String.valueOf(l));
    }

    public static MyString valueOf(Object obj) {
        return new MyString(String.valueOf(obj));
    }
}
