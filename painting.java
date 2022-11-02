import java.awt.*;
import javax.swing.*;

public class painting extends JPanel 
{
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) 
    {
        //drawLine(start x, start y, end x, end y)
        //setColor(Color.COLOR)
        //drawString("what you want to say", start x, stary y)
        //drawRect(start x, start y, width, height)
        //drawOval(start x, start y, width, height)
        //drawArc(start x, start y, width, start angle, end angle)
        
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 70, 50);
        g.setColor(Color.RED);
        g.drawLine(50,50, 150, 60);
        g.setColor(Color.BLACK);
        g.setFont(getFont().deriveFont(50.0f));
        g.drawString("What GGOOD", 100,100);
        g.setColor(Color.PINK.darker());
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.PINK);
        g.fillRect(90,90, 100,100);
        g.setColor(Color.YELLOW);
        //g.fillOval(100, 100, 100, 100);
        g.setColor(Color.BLACK);
        g.drawArc(200, 20, 75, 75, 0, 180);
        

    }

    public static void main(String[] args) 
    {

    var panel = new painting();

    var frame = new JFrame("A simple graphics program");
    frame.setSize(600, 600);
    //panel.setBackground(Color.RED);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
    }
}