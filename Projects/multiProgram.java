import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class multiProgram {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        // CLS cls = new CLS();
        fToC(88);
        moonEarth(180);
        System.out.println("Give me name");
        String user = keyboard.nextLine();
        reverse(user);
        binaryToDecimalExample();
        base10ToBinary();
        hourMinSec();
        System.out.println("Give me a character");
        char input = keyboard.nextLine().charAt(0);
        digitLetter(input);
        System.out.println("Give me a radius");
        double rad = keyboard.nextDouble();
        volueSphere(rad);
        
       
        //cls.main(args);
    }

    public static void fToC(double farnh) {
        double fValue = farnh;
        fValue = (fValue - 32) * (0.56);
        String cValue = (farnh + " in Celcius is " + fValue);
        System.out.println(cValue);
    }

    public static void moonEarth(double eWeight) {
        double mWeight = eWeight / 6;
        System.out.println("Your weight on the moon is " + mWeight);
    }

    public static void reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        System.out.println(sb);
    }

    public static void binaryToDecimalExample() {
        System.out.println(Integer.parseInt("1010", 2));
    }

    public static void base10ToBinary() {
        System.out.println(Integer.toBinaryString(10));
    }

    public static void hourMinSec()
    {
    
        int totalSecs = 143473284;
        int hours;
        int min;
        int sec;

        hours = totalSecs/36000;
        min = (totalSecs%36000)/60;
        sec = totalSecs%60;

        System.out.println(totalSecs + " is equal to "+ hours+ " hours "+ min+" minutes "+ sec+ " seconds ");

    }

    public static void digitLetter(char input)
    {
       char ch1 = input;
       int asciivalue = ch1;

       System.out.println("The ASCII value is " +asciivalue);
    }


    public static void volueSphere(double rad)
    {
        
        System.out.println((4.0/3.0)*Math.PI*(rad*rad*rad));
        
    }
}