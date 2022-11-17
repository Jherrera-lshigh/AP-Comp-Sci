import java.util.*;

class Math
{
    private int x;
    public Math(int variable)
    {
        x = variable;
    }
    public String toString()
    {
        return("3x+5 is equal to " + ((3*x)+5));
    }        
}
class Math2
{
    private int y;
    public Math2(int variable)
    {
        y = variable;
    }
    public String toString()
    {
        return("4x-8 is equal to " + ((4*y)-8));
    }
}


public class OOPAssignment 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Math math = new Math(3);
        Math2 math2 = new Math2(4);

        System.out.println(math.toString());
        System.out.println(math2.toString());


        keyboard.close();

    }
}
