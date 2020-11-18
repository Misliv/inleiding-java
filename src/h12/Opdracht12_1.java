package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    double[] getal = {72, 80, 27, 76, 43, 64, 42, 25, 51, 73};

    public void init() {
        for (int teller = 0; teller < getal.length; teller++);

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
        }
    }
}