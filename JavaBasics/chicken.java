public class chicken
{
    public static void main(String[] args)
    {
        int intArray[];

        intArray = new int[]{1,2,3};
        intArray[2]=4;

        for(int i =0; i<3; i++)
        {
           System.out.print(intArray[i]+ " ");
        }

    }

}