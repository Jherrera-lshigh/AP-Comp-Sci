import java.util.*;


class Computer 
{
    private String processor;
    private int memory;
    private int storage;

    public Computer(String proc, int mem, int stor)
    {
        processor = proc;
        memory = mem;
        storage = stor;
    }

    public String toString()
    {
        return processor + "," + memory + "GB Memory," + storage + "GB Storage";
    }
}

class pets
{
    private int number;
    private String type;
    private String size;
    private String color;

    public pets(int num, String ty, String siz, String col)
    {
        number = num;
        type = ty;
        size = siz;
        color = col;
    }
    public String toString()
    {
        return "You have " + number + " " + size + " ," + color + " " + type + " in your home.";
    }


}

class cars 
{
    private String make;
    private String model;
    private int year;
    private String color;

    public cars(String mak, String mod, int yr, String col)
    {
        make = mak;
        model = mod;
        year = yr;
        color = col;
    }
    public String toString()
    {
        return "You have a "+ color + " " + year + " " + make + " " + model;
    }
}


public class IntrotoOOP
{
    
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This will give you an intro to Object Oriented Programming");

        Computer  comp1 = new Computer("Intel i7", 32, 1000);

        pets margaret = new pets(27, "dogs", "small", "black");

        cars Ezmeralda = new cars("Mini", "Cooper", 2005, "Green");
        
        

        System.out.println(comp1.toString());
        System.out.println(margaret.toString());
        System.out.println(Ezmeralda.toString());

        keyboard.close();
    }
}