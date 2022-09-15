import java.util.Scanner;

public class userName
 {
    public static void main(String [] args)
    {
        System.out.println("Please enter your name.. ");
        Scanner keyboard = new Scanner(System.in);
        {
            String user = keyboard.nextLine();
            System.out.println("Hello " + user);

            System.out.println("Please enter your password");
            String password = keyboard.nextLine();

        
           while (!password.equals("Code"))
            {
                System.out.println("How about we try that again?");
                password = keyboard.nextLine();
            }
  
        System.out.println("Welcome back " + user + " glad to have you back");
            
        }
    }
    
}
