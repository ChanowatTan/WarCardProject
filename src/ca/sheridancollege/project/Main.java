import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WarGame warGame = new WarGame();
        warGame.setPlayers(new ArrayList<>());
        warGame.getPlayers().add(new Player("Player 1"));
        warGame.getPlayers().add(new Player("Player 2"));

        warGame.play();
        warGame.declareWinner();
    }
}


