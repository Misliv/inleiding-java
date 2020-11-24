package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
   //private int[] getal;
    int gemiddelde;
    int[] getal = {72, 80, 27, 76, 43, 64, 42, 25, 51, 73};

    public void init() {
    }

    public void paint(Graphics g) {
        int totaal = 0;
        for (int teller = 0; teller < getal.length; teller ++) {
            totaal += getal[teller];
        }
            gemiddelde = totaal / getal.length;

        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawString("" + gemiddelde, 100, 20);
        }

    }
}