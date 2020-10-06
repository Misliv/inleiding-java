package h06;

import java.applet.Applet;
import java.awt.*;

public class GeldVerdelen extends Applet {
    int geld;
    int uitkomst;

    public void init() {
        geld = 113;
        uitkomst = 113/4;

    }

    public void paint(Graphics g) {
        g.drawString("Jan:" + uitkomst, 10, 20);
        g.drawString("Ali:" + uitkomst, 10,40);
        g.drawString("Jeannette:" + uitkomst,10,60);
        g.drawString("May:" + uitkomst,10,80);
    }
}
