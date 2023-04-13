import java.util.Scanner;


public class magicSquare {
    public static void main(String [] args)
    {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give me a number for length size: ");
    int x = keyboard.nextInt();

    System.out.println("Give me a number for width size: ");
    int y = keyboard.nextInt();



    int[][] array= new int[x][y];
    
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<y;j++)
            {
                array[i][j]=0;
            }
            System.out.println();
        }   

        

        //Not Magic Square
        /* array[0][0]= 7 ;
        array[0][1]= 0 ;
        array[0][2]= 5 ;
        array[1][0]= 2 ;
        array[1][1]= 4 ;
        array[1][2]= 6 ;
        array[2][0]= 3 ;
        array[2][1]= 8 ;
        array[2][2]= 1 ; */
        

        //Magic Sqaure 
        /* 
        array[0][0]= 4 ;
        array[0][1]= 9 ;
        array[0][2]= 2 ;
        array[1][0]= 3 ;
        array[1][1]= 5 ;
        array[1][2]= 7 ;
        array[2][0]= 8 ;
        array[2][1]= 1 ;
        array[2][2]= 6 ;
        */

        for(int i=0; i<x; i++)
        {
            for(int j=0; j<y;j++)
            {
                System.out.print(array[i][j]) ;
            }
            System.out.println();
        }  
        checkMagic(array);
        
        
    }
    
    public static void checkMagic(int[][]matrix)
    {
        int totalx=0;
        int totaly=0;
        int totalcol=0;
        for (int x=0; x < matrix.length; x++) 
        {
            if (matrix[x][0] + matrix[x][1] + matrix[x][2] == 15)
            {
                //System.out.println("magic");
                totalx+=1;

            }

        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] + matrix[1][j] + matrix[2][j] == 15) {
                //System.out.println("magic");
                totaly+=1;
            }
        }
        
        if (matrix[0][0] + matrix[1][1] + matrix[2][2] == 15) {
            //System.out.println("magic");
            totalcol+=1;
        }
        if (matrix[0][2]+ matrix[1][1] + matrix[2][0] == 15) {
            //System.out.println("magic");
                totalcol+=1;
        }
        //System.out.println(totalx + totaly + totalcol);
        int total = totalx + totaly + totalcol;

        if(total == 8)
        {  
            System.out.println("This is a Magic Square");
        }
        else
        {
            System.out.println("Not Magic Square");
        }

        


    }
}