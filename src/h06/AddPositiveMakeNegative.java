package h06;

import java.applet.Applet;
import java.awt.*;

public class AddPositiveMakeNegative extends Applet {
    int maxnumber;
    int number;
    int uitkomst;

    public void init() {
        maxnumber = 2147483647;
        number = 1;
        uitkomst = 2147483647 + 1;

    }

    public void paint(Graphics g) {
        g.drawString("2147483647 + 1 = " + uitkomst,10,10);

    }
}
