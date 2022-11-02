
public class NestedLoops {
    public static void main(String[] args) 
    {
     int x = 0;
     int y = 0;
     
     for(y=5; y>0; y--)
     {
        for (x=5; x>=y; x--)
        {
            System.out.print("*");
        }
        System.out.println();
     }
    }
}
