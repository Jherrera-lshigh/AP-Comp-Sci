import java.util.Scanner;



public class TicTacToe {
    
    private static String[][] board = new String[4][4];
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int turns = 0;
        boolean win= false;

        setBoard();
        while(turns < 9 && !win)
        {
            System.out.println("Player x its yours turn give a row");
            String row = keyboard.nextLine();
            int rowValue = Integer.parseInt(row);

            System.out.println("Player x its yours turn give a column");
            String col = keyboard.nextLine();
            int colValue = Integer.parseInt(col);

            board[rowValue][colValue]=" X ";
            replaceBoard(board);
            checkWinner(board);
            
            System.out.println("Player O its yours turn give a row");
            row = keyboard.nextLine();
            rowValue = Integer.parseInt(row);

            System.out.println("Player x its yours turn give a column");
            col = keyboard.nextLine();
            colValue = Integer.parseInt(col);

            board[rowValue][colValue]=" O ";
            replaceBoard(board);
            checkWinner(board);

            turns +=2;
        }
    
    }
    public static void setBoard()
    {
        for(int i=1; i <4; i++)
        {
            for(int j=1; j <4;j++)
            {
                System.out.print(board[i][j]=" 0 ");
            }
            System.out.println();
        }

    }
    public static void replaceBoard(String[][] board)
    {
        for(int i=1; i<board.length; i++)
        {
            for(int j=1; j<board[0].length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
    public static void checkWinner(String [][] board)
    {
        boolean win = false;
        for(int i=1; i<4; i++)
        {
            if(board[i][1] == board[i][2] && board[i][2] == board[i][3] && !board[i][3].equals("0"))
            {
                win = true;
            }
        }
        for(int i=1; i<4; i++)
        {
            if(board[1][i]== board[2][i] && board[2][i] == board[3][i] && !board[3][i].equals("0"))
            {
                win = true;
            }
        }
        
    }
}
