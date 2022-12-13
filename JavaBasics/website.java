public class website extends Text
{

    public String url;
   public website()
   {

   }
   
  public website(String t, String a, int y, String u)
  {
    url = u;
    title = t;
    author = a;
    year = y;
  }
  public String toString() {
    return author +", "+ title + ", "+ year+", "+ url;
  }
}