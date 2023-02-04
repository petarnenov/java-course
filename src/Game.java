public class Game {
    Player[] players;
    int maxPlayers;
    int currentPlayer = 0;

    Game(int maxPlayers) {
        this.maxPlayers = maxPlayers;
        this.players = new Player[maxPlayers];
    }

    public void addPlayer(Player player) {
        if (this.currentPlayer < this.maxPlayers) {
            this.players[this.currentPlayer] = player;
            this.currentPlayer++;
        }
    }

    public String getWinner() {
        int maxScore = 0;
        String winner = "";
        for (int i = 0; i < this.players.length; i++) {
            if (this.players[i].score > maxScore) {
                maxScore = this.players[i].score;
                winner = this.players[i].name;
            }
        }
        return winner;
    }

    public void printPlayers() {
        
        for (Player player: this.players) {
            System.out.println(player.name);
            System.out.println(player.score);
            System.out.println(player.lives);
            System.out.println(player.level);
            System.out.println(player.health);
            System.out.println(player.damage);
        }
    }
}
