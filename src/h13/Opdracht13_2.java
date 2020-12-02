package h13;

import java.awt.*;
import java.applet.*;


public class Opdracht13_2 extends Applet {
    int baksteen = 15;
    public void init() {

    }
    public void paint(Graphics g) {
        int x;
        int y;
        for (int rij = 0; rij < baksteen; rij++) {
            for (int kolom = 0; kolom < baksteen; kolom++) {
            x = rij * 30;
            y = kolom * 25;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
            tekenRodeBaksteen(g, x, y, 50, 20);
            }
        }
    }
    void tekenRodeBaksteen(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);

    }
}