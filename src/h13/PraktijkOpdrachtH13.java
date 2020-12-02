package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH13 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        tekenStam(g,175,150, 20,80);
        tekenBlad(g,150,100,70,70);

    }
    void tekenBlad(Graphics g, int x1, int y1, int width1, int height1) {
        g.setColor(Color.GREEN);
        g.fillOval(x1, y1, width1, height1);
    }
    void tekenStam(Graphics g, int x2, int y2,  int width2, int height2) {
        g.setColor(Color.GRAY);
        g.fillRect(x2, y2, width2, height2);
    }


}
