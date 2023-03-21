public class ArrayExercises {

  public static void main(String[] args) {

    ex1();
    System.out.println("-----------------------------");
    ex2();
    System.out.println("-----------------------------");
    ex3();
  }

  /* Exercise 1 - Fix the following so that it successfully prints the total rainfall
                  and average rainfall per month
  */
  public static void ex1() {
    double[] rain2015 = {3.33, 3.71, 4.24, 1.69, 0.28, 0.40, 0.57, 0.66, 1.26, 3.69, 4.49, 15.24};
    double total=0.0;

    for (double monthRain : rain2015) 
    {
      total = monthRain;
    }
    System.out.println("Total annual rainfall in 2015: " + total);
    System.out.println("Average rainfall per month in 2015: " + total/12);
  }


  /* Exercise 2 - Fix the following so it successfully prints a 10x10 multiplication table
                  It should go from 1...10 for both dimensions, not 0...9
  */
  public static void ex2() {
    int[][] multTable = new int[11][11];

    for (int r = 0; r < 11; r++) 
    {
      for (int c = 0; c < 11; c++) 
      {
        multTable[r][c] = r * c;
      }
    }

    for (int r = 1; r < 11; r++) {
      for (int c =1; c < 11; c++) {
        System.out.print( multTable[r][c]+" ");
      }
      System.out.println();
    }

  }


  /* Exercise 3 - Fix the following so it calculates each student's overall average,
                  and then calculates the class average (average of each student's
                  overall average)
  */
  public static void ex3() {

    int[][]assignments = new int[4][3];
    double[] studentOverallAverage = new double[assignments.length];

    assignments[0] = new int[] {95, 84, 88};
    assignments[1] = new int[] {78, 93, 86};
    assignments[2] = new int[] {83, 89, 90};
    assignments[3] = new int[] {77, 85, 94};

    for (int student = 0; student < assignments.length; student++) 
    {
      double totalPoints = 0;
      for (int grade = 0; grade < assignments.length -1; grade++) 
      {
        totalPoints = assignments[student][grade];
      }
      studentOverallAverage[student] = totalPoints;
    }

    double classTotal = 0;
    for (double student : studentOverallAverage) {
      System.out.println("Student's total grade average is:" + student);
      classTotal += student;
    }

    System.out.println("The class average is: " + classTotal/assignments.length);

  }

}
