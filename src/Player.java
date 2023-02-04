public class Player {
    String name;
    int score;
    int lives;
    int level;
    int health;
    int damage;

    Player(String name) {
        this.name = name;
        this.score = 0;
        this.lives = 3;
        this.level = 0;
        this.health = 100;
        this.damage = 1;
    }

    public void attack(Player defender) {
        defender.health -= this.damage;
        this.score += this.damage * 10;
    }

    public void attack(Player defender, int damage) {
        defender.health -= damage;
        this.score += damage * 10;
    }

    public void levelUp() {
        this.level += 1;
        this.damage += 1;
        this.health += 10;
    }
}
