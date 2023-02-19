//http://pi.math.cornell.edu/~lipa/mec/lesson6.html
//https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
//https://www.youtube.com/watch?v=0ZONMNUKTfU

public class GameOfLife {
    int[][] board;
    int[][] nextBoard;

    public GameOfLife(int[][] board) {
        this.board = board.clone();
        this.nextBoard = new int[board.length][board[0].length];
    }

    public int[][] getBoard() {
        return board;
    }

    public void next() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int neighbors = countNeighbors(i, j);
                if (board[i][j] == 1) {
                    if (neighbors == 2 || neighbors == 3) {
                        nextBoard[i][j] = 1;
                    } else {
                        nextBoard[i][j] = 0;
                    }
                } else {
                    if (neighbors == 3) {
                        nextBoard[i][j] = 1;
                    } else {
                        nextBoard[i][j] = 0;
                    }
                }
            }
        }
        copyBoard(nextBoard);
    }

    private void copyBoard(int[][] next) {

        for (int i = 0; i < next.length; i++) {
            for (int j = 0; j < next[0].length; j++) {
                board[i][j] = next[i][j];
            }
        }
    }

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < board.length && l >= 0 && l < board[0].length) {
                    if (board[k][l] == 1) {
                        count++;
                    }
                }
            }
        }
        if (board[i][j] == 1) {
            count--;
        }
        return count;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] == 1 ? Colors.GREEN : Colors.RESET);
                System.out.print(board[i][j] == 1 ? " * " : "   ");
            }
            System.out.println();
        }
    }

    public int getLiveCells() {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] board = new int[30][30];

        // lightweight space ship
        // board[14][14] = 1;
        // board[14][17] = 1;
        // board[15][13] = 1;
        // board[16][13] = 1;
        // board[16][17] = 1;
        // board[17][13] = 1;
        // board[17][14] = 1;
        // board[17][15] = 1;
        // board[17][16] = 1;

        // F-pentomino
        board[14][15] = 1;
        board[14][16] = 1;
        board[15][14] = 1;
        board[15][15] = 1;
        board[16][15] = 1;

        GameOfLife game = new GameOfLife(board);

        for (int i = 0; i < 25; i++) {
            game.printBoard();
            System.out.println();
            game.next();
        }

        // while (game.getLiveCells() >0) {
        // game.printBoard();
        // game.next();
        // }
    }
}

// Patterns
// Blinker
// board[14][14] = 1;
// board[14][15] = 1;
// board[14][16] = 1;
// Toad
// board[14][14] = 1;
// board[14][15] = 1;
// board[14][16] = 1;
// board[15][13] = 1;
// board[15][14] = 1;
// board[15][15] = 1;
// Glider
// board[14][14] = 1;
// board[14][15] = 1;
// board[14][16] = 1;
// board[15][13] = 1;
// board[15][14] = 1;
// board[15][15] = 1;
// board[16][14] = 1;
// board[16][15] = 1;
// board[16][16] = 1;
// Lightweight spaceship
// board[14][14] = 1;
// board[14][15] = 1;
// board[14][16] = 1;
// board[15][13] = 1;
// board[15][14] = 1;
// board[15][15] = 1;
// board[16][14] = 1;
// board[16][15] = 1;
// board[16][16] = 1;
// board[17][15] = 1;
// board[18][14] = 1;
// board[18][15] = 1;
// board[18][16] = 1;
// board[19][15] = 1;
// board[20][14] = 1;
// board[20][15] = 1;
// board[20][16] = 1;
// board[21][15] = 1;
// board[22][14] = 1;
// board[22][15] = 1;
// board[22][16] = 1;
// board[23][15] = 1;
// board[24][14] = 1;
// board[24][15] = 1;
// board[24][16] = 1;
// board[25][15] = 1;
// board[26][14] = 1;
// board[26][15] = 1;
// board[26][16] = 1;
// board[27][15] = 1;
// board[28][14] = 1;
// board[28][15] = 1;
// board[28][16] = 1;
// board[29][15] = 1;
