
public class NestedLoops {
    public static void main(String[] args) 
    {
     int x = 10;
     int y = 10;
     
     for(y=10; y>2; y--)
     {
        for (x=0; x<=y; x++)
        {
            System.out.print("*");
        }
        System.out.println();
     }
    }
}
