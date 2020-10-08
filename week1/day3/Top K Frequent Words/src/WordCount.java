/**
 * Counts words and sorts in descending order (highest to lowest).
 */
public class WordCount implements Comparable<WordCount> {
    private String bird;    // "A-well-a bird bird bird, bird is the word"
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
        this.bird = word;
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
     * @return the word
     */
    public String getWord() {
        return this.bird;
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

        // if equal, compare by word
        return this.bird.compareTo(wc.bird);
    }
}