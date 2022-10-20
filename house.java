import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class houseNotTheShow extends JPanel 
{
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g)
    {
        Scanner keyboard = new Scanner(System.in);
        //ADD WHILE LOOP HERE THAT WILL RUN UNTIL USER ENTERS QUIT

        super.paintComponent(g);
        //Main House
        g.setColor(Color.GREEN.darker());
        g.fillRect(750, 500, 450, 450);
        g.setColor(Color.GREEN.darker().darker());
        g.fillRect(400, 600, 350, 350);
        //Door
        g.setColor(Color.GRAY);
        g.fillRect(900, 800, 100, 150);
        g.setColor(Color.YELLOW.darker());
        g.fillOval(980, 880, 15,15);



    }

    public static void main(String[] args) 
    {
        var panel = new houseNotTheShow();
        var frame = new JFrame("MS Paint Got Nothing On Me");
        frame.setSize(1500, 1500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
