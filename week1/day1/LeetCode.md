# LeetCode

### [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)

```java
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> vector = new Vector<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
          vector.add(index[i], nums[i]);
        }

        int[] array = new int[nums.length];

        for (int i = 0; i < vector.size(); i++) {
          array[i] = vector.get(i);
        }

        return array;
    }
}
```

### [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

```java
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().replaceAll(" +", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            sb.insert(0, word + " ");
        }
        
        
        return sb.toString().trim();
    }
}
```
