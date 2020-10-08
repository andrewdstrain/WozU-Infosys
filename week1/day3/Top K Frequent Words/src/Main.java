import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> topWords = Solution.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
        System.out.println(topWords);
        topWords = Solution.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
        System.out.println(topWords);
    }
}
