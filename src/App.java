import java.util.Scanner;

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

        String in = System.console().readLine("Enter your name:");
        System.out.println(in);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(name);

    }
}
