
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;




public class pic extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        BufferedImage Duck= null;
        try{
            Duck = ImageIO.read(new File("Duck.jfif"));
        }
        catch(IOException e){}
        g.drawImage(Duck, 0, 0, 500, 500, getBackground(), getFocusCycleRootAncestor());
        g.setColor(Color.BLACK);
        g.fillOval(335,30,25,25);
        g.setColor(Color.WHITE);
        g.fillOval(340,35,15,15);
        g.setColor(Color.BLACK);
        g.fillOval(345,40,5,5);
        g.fillRect(340, 15, 25, 5);
        g.drawString("WOOF", 430, 70);

    }

    public static void main(String[] args) {

       var panel = new pic();

       var frame = new JFrame("Some Duck");
       frame.setSize(500, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(panel, BorderLayout.CENTER);
       frame.setVisible(true);

    }
}