import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A panel maintaining a picture of a Do Not Enter sign.
 */
 public class DoNotEnterSign extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    /**
     * Called by the runtime system whenever the panel needs painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        var center = new Point(getWidth() / 2, getHeight() / 2);
        var radius = Math.min(getWidth() / 2, getHeight() / 2) - 5;
        var diameter = radius * 2;
        var innerRadius = (int)(radius * 0.9);
        var innerDiameter = innerRadius * 2;
        var barWidth = (int)(innerRadius * 1.4);
        var barHeight = (int)(innerRadius * 0.35);

        g.setColor(Color.WHITE);
        g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
        g.setColor(Color.RED);
        g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
        g.setColor(Color.WHITE);
        g.fillRect(center.x - barWidth/2, center.y - barHeight/2, barWidth, barHeight);
    }

    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new DoNotEnterSign();
            panel.setBackground(Color.GREEN.darker());
            var frame = new JFrame("A simple graphics program");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}