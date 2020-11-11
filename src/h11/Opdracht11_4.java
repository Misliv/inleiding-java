package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 3;
        int y = 0;

        while(teller <=30) {
            y += 20;
            g.drawString("" + teller, 50, y);
            teller++;
        }
    }
}
