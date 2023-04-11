public class magicSquare {
    public static void main(String [] args)
    {

    int[][] array= new int[4][4];
    
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3;j++)
            {
                array[i][j]=0;
            }
            System.out.println();
        }   

        
        array[0][0]= 7 ;
        array[0][1]= 0 ;
        array[0][2]= 5 ;
        array[1][0]= 2 ;
        array[1][1]= 4 ;
        array[1][2]= 6 ;
        array[2][0]= 3 ;
        array[2][1]= 8 ;
        array[2][2]= 1 ;

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print(array[i][j]) ;
            }
            System.out.println();
        }  
        checkMagic(array);
        
    }
    public static void checkMagic(int[][]matrix)
    {
        for (int x=0; x < matrix.length; x++) 
        {
            if (matrix[x][0] + matrix[x][1] + matrix[x][2] == 15)
            {
                
            }

        }
    }
}