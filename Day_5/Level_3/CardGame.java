import java.util.Scanner;
import java.util.Random;

public class CardGame {

    // Suits and ranks for a standard deck of cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }
        String[][] players = new String[numPlayers][numCards];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to display players and their cards
    public static void displayPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players:");
        int numPlayers = scanner.nextInt();

        System.out.println("Enter the number of cards per player:");
        int numCards = scanner.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        try {
            String[][] players = distributeCards(deck, numPlayers, numCards);
            displayPlayersCards(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
