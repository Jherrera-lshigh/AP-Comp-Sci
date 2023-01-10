public class TriangleDriver {

  public static void main(String[] args) {

    // create an instance of an object using the default constructor
    RightTriangle t1 = new RightTriangle();

    // create an instance of an object using the constructor with parameters
    RightTriangle t2 = new RightTriangle(5, 12, 13);

    System.out.println(t1);   // prints the object using its toString() method
    System.out.println(t1.area());
    System.out.println(t1.perimeter());
    t1.scale(3);
    System.out.println(t1);

    

  }

}
