import java.util.*;

class Math1
{
    private int x;
    public Math1(int variable)
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
class WordLen
{
    private String word;
    public WordLen(String variable)
    {
        word = variable;
    }
    public String toString()
    {
        Integer len = word.length();
        len = len - 1;
        len.toString();
        return(word.substring(0, len));
    }
}
class WordEven
{
    private String word2;
    public WordEven(String variable)
    {
        word2=variable;
    }
    public String toString()
    {
       Integer len = word2.length();
       len.toString();

       if(len %2==0)
       {
        return("The length of "+word2+" is even");
       }
       else
       {
        return("The length of "+word2+" is odd");
       }
    }
}


class shuffleCharacter
{
    private String word3;
    private int num;
    private String shuffled;
    public shuffleCharacter(String variable, int numShuffles)
    {
        word3=variable.toString();
        num=numShuffles;
    }

    public String toString()
    {
        for (int i =0; i<num; i++)
        {
            List<String> letters = Arrays.asList(word3.split(""));

            Collections.shuffle(letters);
            shuffled = "";
            for (String letter : letters)
            {
                shuffled += letter;
            }
        }
        return(shuffled);
    }
}

class repeatWord
{
    private String word4;
    private int num2;

    public repeatWord(String variable, int numRepeats)
    {
        word4=variable.toString();
        num2=numRepeats;
    }
    public String toString()
    {
        String repeated = "";
        for (int i =0; i<num2; i++)
        {
            repeated += word4;
        }
        return(repeated);
    }
}


public class OOPAssignment 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Math1 math = new Math1(3);
        Math2 math2 = new Math2(4);

        System.out.println(math.toString());
        System.out.println(math2.toString());

        WordLen word = new WordLen("Word");
        System.out.println(word.toString());

        WordEven word2 = new WordEven("Hello");
        System.out.println(word2.toString());

        shuffleCharacter shuffle = new shuffleCharacter("Duck", 3);
        System.out.println(shuffle.toString());

        repeatWord repeat = new repeatWord("Umbrella", 3);
        System.out.println(repeat.toString());
       
       


        keyboard.close();

    }
}
