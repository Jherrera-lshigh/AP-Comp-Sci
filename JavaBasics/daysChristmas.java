public class daysChristmas {
    public static void main(String [] args)
    {
        String [] dayofChristmas = new String[12];

        dayofChristmas[0] = "A Partridge in a Pear Tree";
        dayofChristmas[1] = "Two Turtle Doves";
        dayofChristmas[2] = "Three French Hens";
        dayofChristmas[3] = "Four Calling Birds";
        dayofChristmas[4] = "Five Gold Rings";
        dayofChristmas[5] = "Six Geese A-laying";
        dayofChristmas[6] = "Seven Swans A-swimming";
        dayofChristmas[7] = "Eight Maids A-milking";
        dayofChristmas[8] = "Nine Ladies Dancing";
        dayofChristmas[9] = "Ten Lords A-leaping";
        dayofChristmas[10] = "Eleven Pipers Piping";
        dayofChristmas[11] = "Twelve Drummers Drumming";

        for (int i =0; i<dayofChristmas.length;i++)
        {
            if (i!=12)
            {
                System.out.println("\nOn the " +(i+1)+" day of Christmas my true love gave to me...");

                for(int j=0;j<=i;j++)
                {
                    System.out.println(dayofChristmas[j]);
                }
            }
        }
    }
}
