public class Catalog {

  public static void main(String[] args) {

    Text book1 = new Book();
    Text book2 = new Book("The Hobbit", "Tolkien", 2006, "Harper Collins");
    Book book3 = new Book("Democracy in America", "Tocqueville", 2003, "Penguin");

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);

    
    Article article1 = new Article("Is Henry Real?","Julian",2405,"TheRealNews.com");
    System.out.println(article1);

    website website1 = new website("Bob Ross","MarsLandingFake/BobRoss/wwwwwww.NewYerkTyme.org",8402,"wwwwwww.NewYerkTyme.org");
    System.out.println(website1);


  }


}
