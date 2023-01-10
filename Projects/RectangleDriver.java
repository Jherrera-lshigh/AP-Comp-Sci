public class RectangleDriver {

  public static void main(String[] args) {

    // create an instance of an object using the default constructor
    Rect r1 = new Rect();

    // create an instance of an object using the constructor with parameters
    Rect r2 = new Rect(5, 12);

    System.out.println(r1);   // prints the object using its toString() method
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    r1.scale(3.0);
    System.out.println(r1);

    /* Add code to scale r2 by some factor and print area, perimeter as above*/
    System.out.println(r2); // before scaling
    System.out.println(r2.area());
    System.out.println(r2.perimeter());
    r2.scale(5.0);
    System.out.println(r2); // after scaling

    System.out.println(r2.area());
    System.out.println(r2.perimeter());


  }

}
