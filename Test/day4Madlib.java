import java.util.Scanner;
public class day4Madlib {

    public static void main (String [] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
        
        System.out.println("This is a Madlib program your madlib needs to include at least 16 inputs");

        System.out.println("This can be proper nouns, adjectives, places, people, etc.");
        System.out.println(" ");
        System.out.println("Please enter a noun");
        String noun1 = keyboard.nextLine();
        System.out.println("Please enter a adjective");
        String adj1 = keyboard.nextLine();
        System.out.println("Please enter a adjective");
        String adj2 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun3 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun4 = keyboard.nextLine();
        System.out.println("Please enter a proper noun");
        String Propernoun1 = keyboard.nextLine();
        System.out.println("Please enter a proper noun");
        String Propernoun2 = keyboard.nextLine();
        System.out.println("Please enter a verb");
        String verb1 = keyboard.nextLine();
        System.out.println("Please enter a adjective");
        String adj3 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun9 = keyboard.nextLine();
        System.out.println("Please enter a proper noun");
        String Propernoun3 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun11 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun12 = keyboard.nextLine();
        System.out.println("Please enter a verb");
        String verb2 = keyboard.nextLine();
        System.out.println("Please enter a proper noun");
        String Propernoun4 = keyboard.nextLine();
        System.out.println("Please enter a noun");
        String noun15 = keyboard.nextLine();
        System.out.println(" ");

        System.out.println("Once upon a time there was a " +noun1+ " sitting on a hill");
        System.out.println("and they had a friend "+adj1+ " who was a rabbit");
        System.out.println("and he was a very " +adj2);
        System.out.println("They sat and ate " +noun3+ " all day");
        System.out.println("They went fishing all day and caught a "+noun4);
        System.out.println("After that they went to the "+Propernoun1+ " and had a picnic");
        System.out.println("They then went to the "+Propernoun2);
        System.out.println("There they found a gang of "+ verb1);
        System.out.println("they got in a "+adj3+" with the gang");
        System.out.println("it appeared that they was going to lose but then he pulled out his " +noun9);
        System.out.println("after winning the fight they went to the "+Propernoun3);
        System.out.println("there they had a "+noun11+ " and a "+noun12+" to celebrate");
        System.out.println("Because they won the fight they got a "+verb2+ " from the king");
        System.out.println(Propernoun4+" became the new name of the town");
        System.out.println("They became rich and lived happily ever after in a "+noun15);


        }
    }
    
}
