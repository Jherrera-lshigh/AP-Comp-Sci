public class RightTriangle {

  // Attributes
  int base;
  int height;
  int hypotenuse;

  // Default Constructor
  public RightTriangle() {
    this.base = 3;
    this.height = 4;
    this.hypotenuse = 5;
  }

  // Constructor
  public RightTriangle(int b, int h, int hyp) {
    this.base = b;
    this.height = h;
    this.hypotenuse = hyp;
  }

  // method with no parameters
  public int area() {
    int area = base * height;
    return area;
  }

  /* Example: Complete this method */
  public int perimeter() {
    return 0;
  }

  // method with parameters
  public void scale(double factor) {
    base = (int)(base * factor);
    height = (int)(height * factor);
    hypotenuse = (int)(hypotenuse * factor);
  }

  public String toString() {
    return base + "/" + height + "/" + hypotenuse + " right triangle";
  }

}
