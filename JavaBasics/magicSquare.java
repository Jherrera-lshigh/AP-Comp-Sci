
import java.util.Scanner;

public class magicSquare {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the size of the square?");
        int x = keyboard.nextInt();

        int[][] array = new int[x][x];

        System.out.println("Do you want random numbers");
        if (keyboard.nextLine().equalsIgnoreCase("yes"))
            ;
        {
            array = Rando(array, x);
            System.out.println("Now generating digits");
            while (CheckerSilent(array) == false) {
                array = Rando(array, x);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        Checker(array);
        checkMult(array);

    }

    public static int[][] Rando(int[][] array, int l) {
        for (int x = 0; x < l; x++) {
            for (int y = 0; y < array.length; y++) {
                array[x][y] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static boolean CheckerSilent(int[][] array) {
        int MagicCheck = 0;

        for (int i = 0; i < array.length; i++) {
            MagicCheck += array[0][i];
        }

        boolean check = true;

        for (int x = 0; x < array.length; x++) {
            int sum = 0;
            for (int y = 0; y < array.length; y++) {
                sum += array[x][y];
            }
            if (sum != MagicCheck) {
                check = false;
            }
        }

        int Diagonalsum = 0;
        for (int i = 0; i < array.length; i++) {
            Diagonalsum += array[i][i];
        }

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;

            for (int t = 0; t < array[0].length; t++) {
                sum += array[t][i];
            }

            if (sum != MagicCheck || Diagonalsum != MagicCheck) {
                check = false;
            }
        }

        return check;
    }

    public static boolean Checker(int[][] jimmy) {

        int MagicCheck = 0;

        for (int i = 0; i < jimmy.length; i++) {
            MagicCheck += jimmy[0][i];
        }

        boolean check = true;

        for (int x = 0; x < jimmy.length; x++) {
            int sum = 0;
            for (int y = 0; y < jimmy.length; y++) {
                sum += jimmy[x][y];
            }
            if (sum != MagicCheck) {
                check = false;
            }
            System.out.println(jimmy[x][0] + "  " + jimmy[x][1] + "  " + jimmy[x][2] + " = " + sum);
        }

        for (int i = 0; i < jimmy.length; i++) {
            System.out.print("|  ");
        }

        int Diagonalsum = 0;
        for (int i = 0; i < jimmy.length; i++) {
            Diagonalsum += jimmy[i][i];
        }
        System.out.print(Diagonalsum);

        System.out.println();

        for (int i = 0; i < jimmy[0].length; i++) {
            int sum = 0;
            for (int t = 0; t < jimmy[0].length; t++) {
                sum += jimmy[t][i];
            }
            if (sum != MagicCheck) {
                check = false;
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Magic Square: " + check);
        return check;
    }

    public static boolean checkMult(int[][] board) {
        // Check rows for a winning pattern
        for (int i = 0; i < board.length; i++) {
            if (board[i][1] * board[i][2] * board[i][3]==0) {
                return true;
            }
        }

        // Check columns for a winning pattern
        for (int j = 0; j < board[0].length; j++) {
            if (board[1][j] * board[2][j]* board[3][j]==0) {
                return true;
            }
        }

        // Check diagonals for a winning pattern
        if (board[1][1]* board[2][2] * board[3][3]==0) {
            return true;
        }
        if (board[1][3] * board[2][2] * board[3][1]==0) {
            return true;
        }

        // No winning pattern found
        return false;
    }

}