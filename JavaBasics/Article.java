public class Article extends Text{

  public String periodical;

  public Article() {

  }

  public Article(String t, String a, int y, String p) {
    periodical = p;
    title = t;
    author = a;
    year = y;


  }

  public String toString() {
    return author +", "+ title + ", "+ year+", "+ periodical;
  }

}
