package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GroupOfCards {

    private List<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


