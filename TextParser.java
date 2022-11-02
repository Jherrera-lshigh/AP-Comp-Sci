import java.util.Scanner;

public class TextParser 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please eneter a long word or phrase");
        String phrase = keyboard.nextLine();

        /* this program will teach you how to prase words.
        It will show you how to use many fuctions that pertain to strings. 
        we will take our phrase and edit it many times.

        .length(); will tell us how many characters are in the string
         */

        System.out.println("Your word/ phrase has: " + phrase.length() + " characters");

        /* .charAt(); will tell us what character is at a certain index
        the index of a string starts at 0 and increases until the end of the string.
        */
        
        System.out.println("The third character is: " + phrase.charAt(2));

        // .toUpperCase(); will make the string all uppercase
        System.out.println("Capitalized all letters: " + phrase.toUpperCase());

        // .toLowerCase(); will make the string all lowercase
        System.out.println("Lowercase all letters: " + phrase.toLowerCase());

        // boolean: a boolean is a variable that can only be true or false

        boolean hasThe = phrase.contains("the");
        System.out.println("Does your phrase have the word \"the\"? " + hasThe);
        // .contains(); will tell us if a string contains a certain substring it will not account for upper or lowercase

        // substring(); will return a new string that is piece of the original string starting at the frist desired index and ending at the last desired index
        // note be careful make sure that you string has enought character in its index. 
        // For example if you typed cat and you want the first 5 letters it will return an error because cat only has 3 characters

        System.out.println("The first 3 characters are: " + phrase.substring(3,5));

        int length = phrase.length();
        int halfway = length / 2;
        int third = length / 3;
        int sendondThird = length*2/3;

        System.out.println("The middle letter is: " + phrase.charAt(halfway)); ;
        System.out.println("The first third is: " + phrase.substring(0, third) );
        System.out.println("The second third is: " + phrase.substring(third, sendondThird) );
        System.out.println("The last third is: " + phrase.substring(sendondThird, length) );

        // .indexOf(); returns the first idex of the desited character
        System.out.println("The first index \'a\' is at index " + phrase.indexOf('a'));



        keyboard.close();
    }
}

