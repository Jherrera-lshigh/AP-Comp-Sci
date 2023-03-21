public class QuidditchPlayer 
{
    private String team;
    private String position;
     
    public QuidditchPlayer() 
    {
    team = "Gryffindor";
    position = "Seeker";
    }
     
    public QuidditchPlayer(String t, String p) 
    {
    team = t;
    position = p;
    }
     
    public String toString() 
    {
    return team + ", " + position;
    }
}