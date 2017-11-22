package player;

public class Main {
    public static void main(String[] args) {
        Player[] players = {new Player("Iza", "Bella", 80),
                new Player("Jan", "Duży", 89),
                new Player("Aldona", "Nick", 55)
        };

        Game game = new Game("Eliminacje", players);
        System.out.println(game.checkWinner());
    }
}
