class anyMath
{
    private int x;

    public anyMath(int variable)
    {
        x = variable;
    }
    public int toInteger()
    {
        return 3*x+9;
    }
}

class getInitials
{
    private String Fname;
    private String Lname;

    public getInitials(String variable1, String variable2)
    {
        Fname = variable1;
        Lname = variable2;
    }
    public String toString()
    {
        return Fname.substring(0,1).toUpperCase() + Lname.substring(0,1).toUpperCase();
    }
}

class Nerd
{
    static String name = "Eugene";
    static String intrest = "school";

    public Nerd(String intrest, String name)
    {
       
    }
   
}

public class Functions 
{
    public static void main(String[] args) 
    {
        anyMath myMath = new anyMath(8);
        System.out.println(myMath.toInteger());

        getInitials myInitials = new getInitials("john", "doe");
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


