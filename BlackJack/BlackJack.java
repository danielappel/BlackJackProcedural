import java.util.ArrayList;

/**
 * Simple Procedural BlackJack Game 
 * 
 */
public class BlackJack
{
    // instance variables - accessible by all methods
    ArrayList<Integer> deck = new ArrayList<Integer>();
    

    /**
     * Constructor for objects of class BlackJack
     */
    public BlackJack()
    {
        initializeDeck();
    }
    
    /**
     * Implements the game mechanics of blackJack for two players
     */
    public void playGame() {
        //TODO
    }
    
    //Add your own methods below
    
    
    
    /**
     * Below are helper methods to simulate a deck of cards and dealing a random card
     * from the deck.  You do not need to modify these methods.
     */
    
    /**
     * Uses a list of card values.  Where the ACE is set to 11 to poplulate an arraylist
     * with the correct distribution of cards and values
     */
    public void initializeDeck() {
        //List of card values, ACE set at 11 to start
        int[] values = {2, 3, 4 ,5 ,6, 7, 8, 9, 10, 10, 10, 10, 11};
        
        /*
         * For each suit (clubs, spades, hearts, diamonds) loop through
         * and add the value to the deck
         */
        for(int i = 0; i < 4; i++) {
            for (int num : values) {
                deck.add(num);
            }
        }
        //Deck should now contain 52 values with correct numeric distribution
    }
    
    /**
     * Randomly deals a card from the deck (based on deck size)
     * @return:  int from possible card values.  Ace will be 11
     */
    public int dealCard() {
        //Get a random card from the deck
        int location;
        int deckLength = deck.size();
        //Use Math.random to get a random card from the deck
        location =(int)(Math.random()*deckLength);
        
        //Return and remove the specified card
        return deck.remove(location);
    }
    
    /**
     * Creates a new (empty) arrayList to hold card values.  It will then use the initialize
     * deck method to get 52 cards with the correct numeric distribution
     */
    public void resetDeck() {
        //Clears all cards from the deck.  Creates a new deck
        deck = new ArrayList<Integer>();
        initializeDeck();
    }
    
    /**
     * Used to visually check what cards are in the deck.  Not needed for game implementation
     */
    public void printDeck() {
        System.out.println("Deck contains (" + deck.size() + " cards):");
        for(int num : deck) {
            System.out.print(num + ", ");
        }
    }
}
