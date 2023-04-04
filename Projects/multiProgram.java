import java.io.IOException;
import java.util.Scanner;

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
        // cls.main(args);
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
}