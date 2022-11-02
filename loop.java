import java.util.Scanner;

public class loop
{
    public static void main(String[] args)
    {
        int guess = 0;
        System.out.println("Please give me a number");
        
        try(Scanner keyboard = new Scanner(System.in))
        {

        guess = Integer.parseInt(keyboard.nextLine() );

        // Math operations in java
        // + add, - subtract, * times, / is divide
        // % mod: This will give you the remainder of the two numebrs beings divided
        // For example: 14 % 3 = 2, 19 % 4 = 3, 22 % 5 = 2 

        // Condintional Opperators
        // Compare  two varibales to see if they meet the given critiera 
        // Does ____ Condotion ____
        // == equal
        // != does not equal
        // > greater than
        // < less than
        // >= greater than or equal too
        // <= less than or equal too

        guess = guess / 3 * 4;

        System.out.println("The math wizard has changed your number guess what the new one is! ");
        
        int newGuess = keyboard.nextInt();

        while (newGuess != guess)
        {
            if(newGuess > guess)
            {
                System.out.println("Your guess is too high. Make another guess!");
                newGuess = keyboard.nextInt();
            }
            else if(newGuess < guess)
            {
                System.out.println("your guess too low. Make another guess!");
                newGuess = keyboard.nextInt();
            }
        }
        
        System.out.println("You did it!");



        keyboard.close();
        }
    }
}