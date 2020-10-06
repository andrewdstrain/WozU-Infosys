# Codewars

### [String Repeat](https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java)

```java
public class RepeatStr {
    public static String repeatStr(final int repeat, final String string) {
        // Initialization
        String out = "";

        // Concatenate repeat number of times
        for (int i = 0; i < repeat; i++) {
          out += string;
        }

        // Repeated string
        return out;
    }
}
```

### [Reversed Sequence](https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java)

```java
public class Reverse{

  public static int[] reverse(int n){
    // Initialize array of numbers
    int[] numbers = new int[n];

    // Loop through numbers in ascending order
    for (int i = 0; i < n; i++) {
      // But order the array in descending order
      numbers[i] = n - i;
    }

    // Array of numbers in reverse order
    return numbers;
  }

}
```




