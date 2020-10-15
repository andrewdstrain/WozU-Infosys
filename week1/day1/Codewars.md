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

### [Alternate capitalization](https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java)

```java
class Caps{
    public static String[] capitalize(String s){
        // Initialization
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        // Loop through string
        for (int i = 0; i < s.length(); i++){
            // Get the character of the day
            String ch = s.substring(i, i + 1);
            
            // Even uppercase, odd lowercase
            if (i % 2 == 0) {
                even.append(ch.toUpperCase());
                odd.append(ch.toLowerCase());
            }
            // Odd uppercase, even lowercase
            else {
                even.append(ch.toLowerCase());
                odd.append(ch.toUpperCase());
            }
        }

        // Put even and odd solutions into our answer
        String[] answer = new String[2];
        answer[0] = even.toString();
        answer[1] = odd.toString();

        // Array of even/odd capitalization of the string
        return answer;
    }
}
```

### [Find numbers which are divisible by given number](https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java)

```java
import java.util.List;
import java.util.Vector;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    List<Integer> list = new Vector<Integer>(numbers.length);

    for (int number : numbers) {
      if (number % divider == 0) {
        list.add(number);
      }
    }

    int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }
}
```
