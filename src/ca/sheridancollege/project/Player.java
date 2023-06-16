/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author chanowat 15 Jun
 */
public class Player {
    private final String name;
    private final List<Card> cards;
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();    
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card playCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public boolean hasCards() {
        return !cards.isEmpty();
    }

    public void clearCards() {
        cards.clear();
    }

    public void addCards(List<Card> cardsToAdd) {
        cards.addAll(cardsToAdd);
    }
    
    public int getCardCount() {
        return cards.size();
    }
}
