public class lineSegments 
{
    private point start;
    private point end;

    public lineSegments(point start, point end)
    {
        this.start = start;
        this.end = end;
    }

    public lineSegments(int startX, int StartY, int endX, int endY)
    {
        this.start = new point(startX, endX);
        this.end = new point(endX, endY);
    }

    public double getSlope()
    {
        return(end.getY()-start.getY()) / (double)(end.getX() - start.getX());
    }

    public double getdistance()
    {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx*dx+ dy*dy);
    }

    public String toString()
    {
        return start + "--->" + end;
    }

}
