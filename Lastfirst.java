import java.util.Scanner;

public class Lastfirst {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First name");
        String firstName = keyboard.nextLine();
        System.out.println("Last name");
        String lastName = keyboard.nextLine();

        System.out.println(lastName + firstName);
        keyboard.close();
    }
}
