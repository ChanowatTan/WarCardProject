/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author chanowat
 */
public class Game {

    private final Player player1;
    private final Player player2;

    public Game() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    public void play() {
        // Implement play method.
    }

    private void dealCards(GroupOfCards deck) {
        // implement dealCards method.
    }

    private int compareCards(Card card1, Card card2) {
        // Compare cards rank
        
    }
    private void handleWar(GroupOfCards deck) {
        // Implement warcard games

}//end class
