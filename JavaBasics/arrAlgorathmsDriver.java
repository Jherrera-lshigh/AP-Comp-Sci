import java.net.Socket;

public class arrAlgorathmsDriver 
{
    public static void main(String []args)
    {
        arrAlgorathms numArray = new arrAlgorathms();
        System.out.println("Number of elements in array: "+numArray.counting());

        System.out.println("Biggest nummber in array: "+numArray.maxNumber());

        System.out.println(numArray.swap(2, 5));
        
    }
}
