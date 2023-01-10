public class Rect
{

    double length;
    double width;


    public Rect()
    {
        this.length=1;
        this.width=1;
    }

    public Rect(int l, int w) 
    {
        this.length = l;
        this.width = w;
    }

    public double area() {
        double area = length * width;
        return area;
    }

    public double perimeter()
    {
        double perimeter = 2*(length + width);
        return perimeter;
    }

    public void scale(double factor)
    {
        length = (length * factor);
        width = (width * factor);
    }


    public String toString()
    {
        return length + " , " + width;
    }   
    
} 