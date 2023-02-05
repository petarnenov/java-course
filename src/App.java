
public class App {
    public static void main(String[] args) {
        Game game = new Game(2);
        Player player1 = new Player("Alex");
        Player player2 = new Player("Pitter");
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.attack(player2);
        player1.levelUp();
        player2.attack(player1, 13);
        player2.levelUp();
        game.printPlayers();
        System.out.println(game.getWinner());

        Monster m1 = new Monster("Bear", 0, 3, 0, 100, 1);
        System.out.println(m1.name());

        System.out.println(game);

    }
}
