package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2H13 extends Applet {
    int boom = 10;

    public void init() {
        setSize(1500,1500);
    }

    public void paint(Graphics g) {
        int x1;
        int y1;
        int x2;
        int y2;
        for (int rij = 1; rij < boom; rij++) {
            for (int kolom = 1; kolom < boom; kolom++) {
                x2 = rij * 130;
                y2 = kolom * 150;
                x1 = rij * 120;
                y1 = kolom * 130;
                tekenBoom(g, x1, y1, 80,50, x2, y2,20,80);
            }
        }
    }
    void tekenBoom(Graphics g, int x1, int y1, int width1, int height1, int x2, int y2, int width2, int height2) {
        g.setColor(Color.GRAY);
        g.fillRect(x2, y2, width2, height2);
        g.setColor(Color.GREEN);
        g.fillOval(x1, y1, width1, height1);
    }
}


