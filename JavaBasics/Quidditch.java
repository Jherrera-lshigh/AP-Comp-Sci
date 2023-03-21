public class Quidditch 
{
    public static void main(String[] args)
    {
     
    QuidditchPlayer[] allPlayers = new QuidditchPlayer[28];
    String[] teams = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
    String[] positions = {"Chaser", "Chaser", "Chaser", "Beater", "Beater", "Keeper", "Seeker"};


   int n=0;
    for(String t: teams)
    {
        for(String p: positions)
        {
            allPlayers[n] = new QuidditchPlayer(t,p);
            n++;
        }
    }


    for(int i=0; i< allPlayers.length;i++)
    {
        System.out.println(allPlayers[i]);
    }


    }

    
     
}