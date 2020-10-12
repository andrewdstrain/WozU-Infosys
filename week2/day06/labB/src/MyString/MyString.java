package MyString;

public class MyString {
    private final String value;

    public MyString() {
        value = "";
    }

    public MyString(String str) {
        value = str;
    }

    public MyString(MyString str) {
        value = str.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyString) {
            MyString str = (MyString) obj;
            return value.equals(str.value);
        } else if (obj instanceof String) {
            String str = (String) obj;
            return value.equals(str);
        }
        return false;
    }

    @Override
    public String toString() {
        return value;
    }

    public char charAt(int index) {
        return value.charAt(index);
    }

    public int compareTo(MyString anotherMyString) {
        return value.compareTo(anotherMyString.value);
    }

    public MyString concat(MyString str) {
        return new MyString(value.concat(str.value));
    }

    public boolean contains(CharSequence cs) {
        return value.contains(cs);
    }

    public boolean endsWith(MyString suffix) {
        return value.endsWith(suffix.value);
    }

    public boolean equalsIgnoreCase(MyString anotherString) {
        return value.equalsIgnoreCase(anotherString.value);
    }

    public int indexOf(int ch) {
        return indexOf(ch, 0);
    }

    public int indexOf(int ch, int fromIndex) {
        return value.indexOf(ch, fromIndex);
    }

    public int indexOf(MyString str) {
        return indexOf(str, 0);
    }

    public int indexOf(MyString str, int fromIndex) {
        return value.indexOf(str.value, fromIndex);
    }

    public int length() {
        return value.length();
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public boolean matches(MyString regex) {
        return value.matches(regex.value);
    }

    public MyString replace(char oldChar, char newChar) {
        return new MyString(value.replace(oldChar, newChar));
    }

    public MyString replace(CharSequence target, CharSequence replacement) {
        return new MyString(value.replace(target, replacement));
    }

    public MyString replaceAll(MyString regex, MyString replacement) {
        return new MyString(value.replaceAll(regex.value, replacement.value));
    }

    public MyString replaceFirst(MyString regex, MyString replacement) {
        return new MyString(value.replaceFirst(regex.value, replacement.value));
    }

    public MyString[] split(MyString regex, int limit) {
        String[] words = value.split(regex.value, limit);
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
        return value.startsWith(prefix.value, offset);
    }

    public boolean startsWith(MyString prefix) {
        return startsWith(prefix, 0);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return value.subSequence(beginIndex, endIndex);
    }

    public MyString substring(int beginIndex, int endIndex) {
        return new MyString(value.substring(beginIndex, endIndex));
    }

    public MyString substring(int beginIndex) {
        return substring(beginIndex, value.length());
    }

    public MyString toLowerCase() {
        return new MyString(value.toLowerCase());
    }

    public MyString toUpperCase() {
        return new MyString(value.toUpperCase());
    }

    public MyString trim() {
        return new MyString(value.trim());
    }
}
