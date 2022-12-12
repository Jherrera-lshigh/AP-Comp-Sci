public class driverLine 
{
    public static void main(String [] args)
    {

        lineSegments segments = new lineSegments(9,4,5,3);

        System.out.println(segments);

        System.out.println("Slope:" + segments.getSlope());
        System.out.println("Distance:" + segments.getdistance());
    }
}
