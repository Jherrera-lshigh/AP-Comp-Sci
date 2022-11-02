import java.awt.*;
import javax.swing.*;


public class GraphingLines extends JPanel
{
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int x = 0;
        int y = 300;

        g.setColor(Color.ORANGE);
        for (x=0; x<=500; x+=20 )
        {
            g.drawLine(x,y,x, y-400);
            
        }
        x=0;
        for (y=0; y<=500; y+=20)
        {
            g.drawLine(x,y, x+500, y);
            
        }

        g.setColor(Color.BLACK);
        for (x=0; x<=500; x+=5)
        {
            y = (int) (300-(x*x)/20);
            g.fillOval(x, y, 8,8);
        }
        g.setColor(Color.RED);
        for (x=0; x<=500; x+=5)
        {
            y = (int) (320-(x*x)/20);
            g.drawLine(x,y, x-4, y+35);
        }
    
    }

    public static void main(String[] args)
    {
        var panel = new GraphingLines();
        var frame = new JFrame("Graphing Lines");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
