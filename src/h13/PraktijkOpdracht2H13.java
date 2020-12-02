package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2H13 extends Applet {
    int boom = 7;

    public void init() {
    }

    public void paint(Graphics g) {
        int x1;
        int y1;
        int x2;
        int y2;
        for (int rij = 1; rij < boom; rij++) {
            for (int kolom = 1; kolom < boom; kolom++) {
                x1 = rij * 50;
                y1 = kolom * 60;
                x2 = rij * 60;
                y2 = kolom * 50;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    tekenBoom(g, x1, y1, 20, 80, x2, y2, 70, 70);
            }
        }
    }
    void tekenBoom (Graphics g,int x1, int y1, int width1, int height1, int x2, int y2, int width2, int height2){
        g.setColor(Color.GRAY);
        g.fillRect(x1, y1, width1, height1);
        g.setColor(Color.GREEN);
        g.fillOval(x2, y2, width2, height2);
    }
}


