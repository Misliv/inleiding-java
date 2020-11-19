package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_2 extends Applet {
    Button[] knop;

    public void init() {
        knop = new Button[25];
        for (int teller = 0; teller < knop.length; teller++);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < knop.length; teller++) {
            g.drawString("" + knop, 50, 20 * teller + 20);
        }
    }
}
