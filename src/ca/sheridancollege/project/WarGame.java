/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WarGame extends Game {

    private GroupOfCards deck;
    private GroupOfCards player1Cards;
    private GroupOfCards player2Cards;

    public WarGame() {
        super("War");
        deck = new GroupOfCards(52);
        player1Cards = new GroupOfCards(0);
        player2Cards = new GroupOfCards(0);

        initializeDeck();
        dealCards();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        List<Card> cards = new ArrayList<>();

        for (String suit : suits) {
            for (int value : values) {
                Card card = new PlayingCard(suit, value);
                cards.add(card);
            }
        }

        deck.setCards(cards);
        deck.shuffle();
    }

    private void dealCards() {
        List<Card> cards = deck.getCards();

        for (int i = 0; i < cards.size(); i++) {
            if (i % 2 == 0) {
                player1Cards.getCards().add(cards.get(i));
            } else {
                player2Cards.getCards().add(cards.get(i));
            }
        }
    }

    @Override
    public void play() {
        int round = 1;
        boolean gameEnded = false;

        while (!player1Cards.getCards().isEmpty() && !player2Cards.getCards().isEmpty() && !gameEnded) {
            System.out.println("Round " + round + ":");

            Card player1Card = player1Cards.getCards().remove(0);
            Card player2Card = player2Cards.getCards().remove(0);

            System.out.println("Player 1 plays: " + player1Card);
            System.out.println("Player 2 plays: " + player2Card);

            if (player1Card.getValue() > player2Card.getValue()) {
                player1Cards.getCards().add(player1Card);
                player1Cards.getCards().add(player2Card);
                System.out.println("Player 1 wins the round!");
                gameEnded = true;
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2Cards.getCards().add(player2Card);
                player2Cards.getCards().add(player1Card);
                System.out.println("Player 2 wins the round!");
                gameEnded = true;
            }

            round++;
            System.out.println("Player 1 cards: " + player1Cards.getCards().size());
            System.out.println("Player 2 cards: " + player2Cards.getCards().size());
            System.out.println();
        }
    }

    @Override
    public void declareWinner() {
        if (player1Cards.getCards().isEmpty()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("Player 1 wins the game!");
        }
    }
}


