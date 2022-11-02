import java.util.Scanner;

public class LeftorRight 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        /*0 is left hand 
        1 is right hand*/

        int hand = (int)(Math.random() * 2);
        // set our guess to something that is not left or right

        int guess = -2;

        //add while checker 

        while(guess != hand)
        {
            System.out.println("Which hand am I holding the candy in? Please type Left or Right)");

            String input = keyboard.nextLine();
            input.toLowerCase();
    
            if (input.equals("left"))
            {
                guess = 0;
            }
            else if (input.equals("right"))
            {
                guess = 1;
            }
            else
            {
                System.out.println("Please type Left or Right");
            }
    
        }

        System.out.println("You guessed correctly! Here is your candy!");



        keyboard.close();
    }
}

