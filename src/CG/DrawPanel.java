package CG;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = x + r * Math.cos(a);
            double y1 = y + r * Math.sin(a);
            double x2 = x +(r + l) * Math.cos(a);
            double y2 = y +(r + l) * Math.sin(a);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
        g.setColor(oldColor);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D gr = (Graphics2D) g;

        gr.setColor(Color.CYAN);
        gr.fillRect(0, 0, getWidth(), getHeight());
        gr.setColor(Color.GREEN);
        gr.fillRect(0, getWidth() / 2, getWidth(), getHeight() / 2);
        
        drawSun(gr, getWidth() / 4, getHeight() / 4, 50, 40, 11, Color.ORANGE);
    }
}
