
public class wordSearch
{
   public static void main (String [] args)
    {
        String[][] wordbank = new String[5][5];
        int l=0;
        int k=0;

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5;j++)
            {
                wordbank[i][j]= "a";
            }
        }

        wordbank[2][1]= "p";
        wordbank[2][2]= "e";
        wordbank[2][3]= "s";

        wordbank[0][4]="m";
        wordbank[1][4]="o";
        wordbank[2][4]="n";
        wordbank[3][4]="e";
        wordbank[4][4]="y";

        String word="";
        String word2="";
        

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5;j++)
            {
                System.out.print(wordbank[i][j]+" ");
            }
            System.out.println();
        }

        
        for(int i=0; i<5; i++)
        {
            
            for(int j=0; j<5;j++)
            {
                word+=wordbank[l][j];
            }
            l++;
        }
        l=0;
        for(int i=0; i<5; i++)
        {
            
            for(int j=0; j<5;j++)
            {
                word2+=wordbank[j][l];
            }
            l++;
        }
        
        

        System.out.println("Word Ape found at index: "+(word.indexOf("apes")));
        System.out.println("Word Money found at: "+(word2.indexOf("money")+1));
        
        

    }
}