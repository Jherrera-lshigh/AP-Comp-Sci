
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

}