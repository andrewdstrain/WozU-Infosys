/**
 * Counts words and sorts in descending order (highest to lowest).
 */
public class WordCount implements Comparable<WordCount> {
    private String word;
    private int count;

    // Prevent default constructor
    private WordCount() {
        super();
    }

    /**
     * Creates new word and counts it as the first word.
     *
     * @param word word to count
     */
    public WordCount(String word) {
        this();
        this.word = word;
        this.count = 1;
    }

    /**
     * Increments the counter
     */
    public void increment() {
        this.count++;
    }

    /**
     * Returns the word that is counted
     *
     * @return the word, word, word
     */
    public String getWord() {
        return this.word;
    }

    public int compareTo(WordCount wc) {
        // Compare highest to lowest
        if (this.count > wc.count) {
            return -1;
        }

        // Compare highest to lowest
        if (this.count < wc.count) {
            return 1;
        }

        // if equal, Compare by word
        return this.word.compareTo(wc.word);
    }
}