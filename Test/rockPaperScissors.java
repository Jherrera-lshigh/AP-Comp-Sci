import java.util.Scanner;

public class rockPaperScissors
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        /*0 is rock
        1 is paper
        2 is sissors*/

        int computer = (int)(Math.random() * 3);

        int input = -2;
        System.out.println("Welcome to Rock Paper Sissors! Please type 0 for Rock, 1 for Paper, or 2 for Sissors");
        input = keyboard.nextInt();

        while(input != 0 && input != 1 && input != 2)
        {
            System.out.println("Please type 0 for Rock, 1 for Paper, or 2 for Sissors");
            input = keyboard.nextInt();
        }

        if(input ==computer)
        {
            System.out.println("It's a tie!");
        }
        else if ( input == 0 && computer == 1)
        {
            System.out.println("You lose! Paper beats Rock!");
        }
        else if (input == 0 && computer == 2)
        {
            System.out.println("You win! Rock beats Sissors!");
        }
        else if (input == 1 && computer == 0)
        {
            System.out.println("You win! Paper beats Rock!");
        }
        else if (input == 1 && computer == 2)
        {
            System.out.println("You lose! Sissors beats Paper!");
        }
        else if (input == 2 && computer == 0)
        {
            System.out.println("You lose! Rock beats Sissors!");
        }
        else if (input == 2 && computer == 1)
        {
            System.out.println("You win! Sissors beats Paper!");
        }

        keyboard.close();

    }


}
    

