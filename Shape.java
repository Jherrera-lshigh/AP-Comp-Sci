import java.util.*; 
    
public class Shape
{
    public static void main (String [] args)
    {
        //Asks user what shape they want to draw
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What Shape do you want: Square, Rectangle, Right_Triangle, Isoceles_Triangle or QUIT?");
        String Input = keyboard.nextLine();

        if(Input.equals("Square"))
        {
            //Asks user for the size of the square they want
            System.out.println("What size do you want?");
            int Size = keyboard.nextInt();

            //Draws the Square
            for(int i = 0; i < Size; i++)
            {
                for(int j = 0; j < Size; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Input.equals("Rectangle"))
        {
            //Asks user for the size of the rectangle they want
            System.out.println("What length do you want?");
            int Length = keyboard.nextInt();
            System.out.println("What width do you want?");
            int Width = keyboard.nextInt();

            //Draws the Rectangle
            for(int i=0; i< Length; i ++)
            {
                for(int j=0; j < Width; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(Input.equals("Right_Triangle"))
        {
            //Asks user what size they want for the trianlge
            System.out.println("What size do you want?");
            int Size = keyboard.nextInt();
            for(int i=0; i < Size; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (Input.equals("Isoceles_Triangle"))
        {
            //Asks user what size they want for the triangle
            System.out.println("What size do you want?");
            int Size = keyboard.nextInt();

            //Draw the Triangle
            for(int i=0; i<Size; i++)
            {
                for(int j=0; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int x= Size; x>0; x--)
            {
                for (int y=0; y<x; y++)
                {
            System.out.print("*");
                }
            System.out.println();
            }
        }
        else if (Input.equals("QUIT"))
        {
            System.exit(0);
        }
        
        keyboard.close();
    }
}