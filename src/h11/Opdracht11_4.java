package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int getal1 = 3;
        int nummer;
        int y = 20;

        while(teller <= 10) {
            y += 20;
            nummer = getal1 * teller;
            g.drawString("" + nummer, 50, y);
            teller++;
        }
    }
}
