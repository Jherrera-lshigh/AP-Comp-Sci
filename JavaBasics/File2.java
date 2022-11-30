public class File2 
{
    public static void main(String[] args) 
    {
        anyMath myMath = new anyMath(8);
        System.out.println(myMath.toInteger());

        getInitials myInitials = new getInitials("Derek", "Banas");
        System.out.println(myInitials.toString());

        System.out.println(Nerd.intrest);
        System.out.println(Nerd.name);

        if(Nerd.intrest.equals("school"))
        {
            System.out.println("I'm a nerd");
        }
        else
        {
            System.out.println("I'm not a nerd");
        }
    }
}
