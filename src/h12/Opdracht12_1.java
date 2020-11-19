package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    int[] getal = {72, 80, 27, 76, 43, 64, 42, 25, 51, 73};
    int gemiddelde;

    public void init() {
        getal = new int[10];

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