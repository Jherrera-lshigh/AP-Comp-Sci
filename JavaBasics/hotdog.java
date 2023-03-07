import java.util.ArrayList;
public class hotdog 
{
    public static void main(String [] args)
    {
        ArrayList<String> hotdogList = new ArrayList<>();

        hotdogList.add("Bun");
        hotdogList.add("Weiner");
        hotdogList.add("Mustard");
        hotdogList.add("Cheese");
      

        hotdogList.set(2, "Ketchup");

        hotdogList.remove(3);

        System.out.println("You made a hotdog with "+hotdogList+" enjoy!");

    }
}
