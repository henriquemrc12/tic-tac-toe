import java.io.IOException;

public class TicTacToe {

    private static final int COLUMNS = 3;
    private static final int ROWS    = 3;

    private static String[][] table = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        boolean isExit = false;

        printTitle();
        printTable();

        while (!isExit) {
            readPlay();
            pcPlay();
            isExit = getGameStatus();
            printTable();
        }
    }

    private static void printTitle() {
        System.out.println("|--------------------TIC TAC TOE--------------------|");
    }

    private static void printTable() {
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                String endRow = ((j + 1) < ROWS) ? " |" : " ";
                System.out.print(" " + table[i][j] + endRow);
            }
            if ((i + 1) < COLUMNS)
                System.out.println("\n----------");
        }
    }

    private static boolean getGameStatus() {
        return true;
    }

    private static void pcPlay() {
        return;
    }

    private static void readPlay() {

        return;
    }
}