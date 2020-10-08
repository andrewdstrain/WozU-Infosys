# Sets and HashMap Problems

### [Two Sum](https://leetcode.com/problems/two-sum/)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        
        for (int i = 0;  i < length; i++ ) {
            for (int j = 0; j < length; j++ ) {
                // may not use the same element twice
                if (i == j) continue;
                
                // Do we have a winner?!
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        
        return null;
    }
}
```

### [Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/)

The solution is coded [here](Top%20K%20Frequent%20Words/src).
