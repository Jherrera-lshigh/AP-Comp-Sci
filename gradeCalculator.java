import java.util.Scanner;

public class gradeCalculator 
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
    
       System.out.println("This program will calculate your AP Computer Science grade it will also tell you your letter grade");

        System.out.println("Please enter your average grade for key concepts grade:");
        int keyConcepts = keyboard.nextInt();

        System.out.println("Please enter your average grade for projects: ");
        int projects = keyboard.nextInt();

        System.out.println("Please enter your average grade for quizzes: ");
        int quizzes = keyboard.nextInt();

        System.out.println("Please enter your average grade for tests: ");
        int tests = keyboard.nextInt();

        double averageGrade = keyConcepts *0.4 + projects *0.2 + quizzes *0.2 + tests *0.2;

        if (averageGrade >= 90)
        {
            System.out.println("Your average grade is " + averageGrade +" % "+ " and your letter grade is an A, you are doing great!");
        }
        else if (averageGrade >= 80)
        {
            System.out.println("Your average grade is " + averageGrade + " %" + " and your letter grade is a B, you are doing good!");
        }
        else if (averageGrade >= 70)
        {
            System.out.println("Your average grade is " + averageGrade + "%" + " and your letter grade is a C, you are doing eh.");
        }
        else if (averageGrade >= 60)
        {
            System.out.println("Your average grade is " + averageGrade + "%" + " and your letter grade is a D, you are doing bad.");
        }
        else
        {
        System.out.println("Your average grade is " + averageGrade + "%" + " and your letter grade is an F, you are doing horrible.");
        }

        keyboard.close();
    }

        

}

