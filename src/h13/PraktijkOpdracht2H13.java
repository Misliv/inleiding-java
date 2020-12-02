package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2H13 extends Applet {
    int blad = 7;
    int stam = 7;

    public void init() {
    }

    public void paint(Graphics g) {
        int x1;
        int y1;
        int x2;
        int y2;
        for (int rij = 1; rij < blad; rij++) {
            for (int kolom = 1; kolom < blad; kolom++) {
                x1 = rij * 70;
                y1 = kolom * 60;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    tekenBlad(g, x1, y1, 70, 70);
            for (rij = 1; rij < stam; rij++) {
                for (kolom = 1; kolom < stam; kolom++) {
                    x2 = rij * 60;
                    y2 = kolom * 50;
                    if ((rij % 2 == 0) == (kolom % 2 == 0))
                tekenStam(g, x2, y2, 20, 80);
                }
            }
            }
        }
    }
    void tekenBlad (Graphics g,int x1, int y1, int width1, int height1){
        g.setColor(Color.GREEN);
        g.fillOval(x1, y1, width1, height1);
    }
    void tekenStam (Graphics g,int x2, int y2, int width2, int height2){
        g.setColor(Color.GRAY);
        g.fillRect(x2, y2, width2, height2);
    }
}


