package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void checkingTheStrengthOfThePlayers() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 100);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Maria", "Olya");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheStrengthOfThePlayers2() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 20);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Maria", "Olya");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingWhenTheForcesOfThePlayersAreEqual() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 50);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Maria", "Olya");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingWhenTheFirstPlayerIsNotThere() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 50);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Elena", "Olya"));
    }

    @Test
    public void checkingWhenThereIsNoSecondPlayer() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 50);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Maria", "Oleg"));
    }

    @Test
    public void checkingWhenThereAreNoPlayers() {
        Game game = new Game();
        Player player1 = new Player(1, "Maria", 50);
        Player player2 = new Player(2, "Olya", 50);

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Elena", "Oleg"));
    }
}