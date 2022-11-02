import java.awt.*;
import javax.swing.*;


public class houseNotTheShow extends JPanel 
{
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g)
    {
    
        super.paintComponent(g);
        //Main House
        g.setColor(Color.GREEN.darker());
        g.fillRect(725, 600, 425, 340);
        g.setColor(Color.yellow.darker());
        g.fillRect(400, 600, 350, 350);

        //Door
        g.setColor(Color.GRAY);
        g.fillRect(900, 800, 100, 150);
        g.setColor(Color.YELLOW.darker());
        g.fillOval(980, 880, 15,15);

        //roof
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {400, 1150, 800}, new int[] {600, 600, 400}, 3);

        //windows
        g.setColor(Color.BLUE);
        g.fillRect(500, 700, 100, 100);
        g.fillRect(775,700,100,100);
        g.fillRect(1020, 700, 100, 100);

        //bushes
        g.setColor(Color.GREEN);
        int i = 0;
        int j = 725;
        while (i <35)
        {
            g.fillOval(j, 900, 100, 100);
            j+=10;
            i++;
        }
       

        //car
        g.setColor(Color.RED);
        g.fillRect(200, 900, 200, 50);
        g.setColor(Color.BLACK);
        g.fillArc(200, 920, 50, 50, 0, -180);
        g.fillArc(350, 920, 50, 50, 0, -180);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(250, 850, 100, 50);
        g.setColor(Color.yellow);
        g.fillRect(200, 900, 15, 15);
        g.drawLine(195,900,180,900);
        g.setColor(Color.RED.darker());
        g.fillRect(385, 900, 15, 15);


        //txt
        g.setColor(Color.BLACK);
        g.setFont(getFont().deriveFont(50f));
        g.drawString("HOME SWEET HOME", 550 ,200);
        g.drawLine(550, 200, 1055, 200);


    }

    public static void main(String[] args) 
    {
        var panel = new houseNotTheShow();
        var frame = new JFrame("MS Paint Got Nothing On Me");
        frame.setSize(1500, 1500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //panel.setBackground(Color.Green.darker());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
