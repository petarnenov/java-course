import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class GameOfLifeTest {
    @Test
    public void shouldEvaluateToZ() {
        int[][] board = new int[][] {
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };

        GameOfLife game = new GameOfLife(board);
        game.next();
        
        int[][] expected = new int[][] {
                { 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };

        assertArrayEquals(expected, game.getBoard());
    }
}
