import java.util.Scanner;

public class passcode {
    
    public static void main(String [] args)
    {
        System.out.print("Please enter a word or a phrase ");
        try(Scanner keyboard = new Scanner(System.in))
        {
            String input = keyboard.nextLine();
            // if statment check to see IF an input matches the crieraia ELSE it does not
            // THe computer will check in this order: If > else if > else. You can have as many else ifs
            // need however there can only be one IF and one ELSE

            if(input.equals("apples"))
            {
                System.out.println("Great  choice! Apples are fantastic.");
            }
            else if( input.equals("oranges"))
            {
                System.out.println("Ehh okay... I guess.");
            }

            else if(input.equals("watermelon"))
            {
                System.out.println("Makes sense your 60% water");
            }

            else 
            {
                System.out.println("Do you even fruit?!");
            }
        }
    }
}