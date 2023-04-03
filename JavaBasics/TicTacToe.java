import java.util.Scanner;

public class TicTacToe {

    private static String[][] board = new String[4][4];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int turns = 0;
        boolean win = false;

        setBoard();
        while (turns < 9 && !win) {
            System.out.println("Player x its yours turn give a row");
            String row = keyboard.nextLine();
            int rowValue = Integer.parseInt(row);

            System.out.println("Player x its yours turn give a column");
            String col = keyboard.nextLine();
            int colValue = Integer.parseInt(col);

            board[rowValue][colValue] = " X ";
            replaceBoard(board);

            System.out.println("Player O its yours turn give a row");
            row = keyboard.nextLine();
            rowValue = Integer.parseInt(row);

            System.out.println("Player x its yours turn give a column");
            col = keyboard.nextLine();
            colValue = Integer.parseInt(col);

            board[rowValue][colValue] = " O ";
            replaceBoard(board);

            turns += 2;
            win = checkForWinner(board, " X ");
            if (win) {
                System.out.println("Player X wins");
            } else {
                win = checkForWinner(board, " O ");
                if (win) {
                    System.out.println("Player O wins");
                }
            }

        }
        keyboard.close();

    }

    public static void setBoard() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(board[i][j] = " 0 ");
            }
            System.out.println();
        }

    }

    public static void replaceBoard(String[][] board) {
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean checkForWinner(String[][] board, String symbol) {
        // Check rows for a winning pattern
        for (int i = 1; i < board.length; i++) {
            if (board[i][1].equals(symbol) && board[i][2].equals(symbol) && board[i][3].equals(symbol)) {
                return true;
            }
        }

        // Check columns for a winning pattern
        for (int j = 1; j < board[0].length; j++) {
            if (board[1][j].equals(symbol) && board[2][j].equals(symbol) && board[3][j].equals(symbol)) {
                return true;
            }
        }

        // Check diagonals for a winning pattern
        if (board[1][1].equals(symbol) && board[2][2].equals(symbol) && board[3][3].equals(symbol)) {
            return true;
        }
        if (board[1][3].equals(symbol) && board[2][2].equals(symbol) && board[3][1].equals(symbol)) {
            return true;
        }

        // No winning pattern found
        return false;
    }

}
