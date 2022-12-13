public class Book extends Text {

  public String publisher;

  public Book() {
    super();
    publisher = "";
  }

  public Book(String t, String a, int y, String p) {
    super(t, a, y);
    publisher = p;
  }

  public String toString() {
    String str = super.toString();
    return str + ", " + publisher;
  }

}
