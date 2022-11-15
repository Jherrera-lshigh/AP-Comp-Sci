import java.awt.*;
import javax.swing.*;

public class Smile extends JPanel 
{
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 25, 25);
        g.fillOval(200, 100, 25, 25);
        g.fillArc(150, 150, 50, 50, 180, 180);
        g.setColor(Color.WHITE);
        g.fillRect(150,170,50 ,15);


    }
    public static void main(String[] args) 
    {

    var panel = new Smile();

    var frame = new JFrame("A simple graphics program");
    frame.setSize(600, 600);
    //panel.setBackground(Color.RED);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
    }
}
