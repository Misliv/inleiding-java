package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2H13 extends Applet {
    int boom = 6;

    public void init() {
        setSize(1500,1500);
    }

    public void paint(Graphics g) {
        int leafx;
        int leafy;
        int trunkx;
        int trunky;
        for (int rij = 0; rij < boom; rij++) {
            for (int kolom = 0; kolom < boom; kolom++) {
                trunkx = rij * 120 + 150;
                trunky = kolom * 129 + 129;
                leafx = rij * 120 + 120;
                leafy = kolom * 120 + 120;
                tekenBoom(g, leafx, leafy, 80,50, trunkx, trunky,20,70);
            }
        }
    }
    void tekenBoom(Graphics g, int leafx, int leafy, int width1, int height1, int trunkx, int trunky, int width2, int height2) {
        g.setColor(new Color(139,69,19));
        g.fillRect(trunkx, trunky, width2, height2);
        g.setColor(Color.GREEN);
        g.fillOval(leafx, leafy, width1, height1);
    }
}


