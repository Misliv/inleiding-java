package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2H13 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        tekenBoom(g,175,150, 20,80,150,100,70,70);
    }
    void tekenBoom(Graphics g, int x1, int y1, int width1, int height1, int x2, int y2,  int width2, int height2) {
        g.setColor(Color.GRAY);
        g.fillRect(x1, y1, width1, height1);
        g.setColor(Color.GREEN);
        g.fillOval(x2, y2, width2, height2);
    }
}
