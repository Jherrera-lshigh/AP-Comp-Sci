import java.util.Scanner;

public class apples {
    public static void main(String [] args){
        System.out.println("This is an example of how to create a user input. ");
        System.out.println("It will allow the user to type theri answer and save it as a string.");
        System.out.println(" ");

        System.out.print("Please enter a word or a phrase ");
        try(Scanner keyboard = new Scanner(System.in)){
            String input = keyboard.nextLine();

            //System.out.println("You said " + input);
    
            System.out.println("there are " + input.length() + " character in your word");
            System.out.println("The second to last letter is: " + input.charAt(input.length()-2));
    
        }
       
    }
}
