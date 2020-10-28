package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH6 extends Applet {
    double cijfer1, cijfer2, cijfer3, uitkomst;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst,50,50);

    }
}
