package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    double[] getal = {72, 80, 27, 76, 43, 64, 42, 25, 51, 73};
    int gemiddelde;
    public void init() {
        getal = new double[10];
        getal[0] = 73;
        getal[1] = 72;
        getal[2] = 80;
        getal[3] = 27;
        getal[4] = 76;
        getal[5] = 43;
        getal[6] = 64;
        getal[7] = 42;
        getal[8] = 25;
        getal[9] = 51;

        for (int teller = 0; teller < getal.length; teller++);
        gemiddelde = 553 / 10;

    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("" + gemiddelde, 100, 20);
        }

    }
}