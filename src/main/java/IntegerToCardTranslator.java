// AI-generated
public class IntegerToCardTranslator {

    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    private static final String[] SUITS = {
            "Spades", "Diamonds", "Hearts", "Clubs"
    };

    /**
     * Translates an integer (1-52) to its corresponding playing card.
     *
     * @param n integer in range [1, 52]
     * @return card name, e.g., "Ace of Hearts"
     * @throws IllegalArgumentException if n is out of range
     */
    public static String getCard(int n) {
        if (n < 1 || n > 52) {
            throw new IllegalArgumentException("Input must be between 1 and 52");
        }

        // Zero-based index
        int index = n - 1;

        // Determine rank and suit indices
        int rankIndex = index / 4;   // 0 = "2", 12 = "Ace"
        int suitIndex = index % 4;   // 0 = "Spades", etc.

        return RANKS[rankIndex] + " of " + SUITS[suitIndex];
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(getCard(1));   // 2 of Spades
        System.out.println(getCard(4));   // 2 of Clubs
        System.out.println(getCard(5));   // 3 of Spades
        System.out.println(getCard(52));  // Ace of Clubs
    }
}
