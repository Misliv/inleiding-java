package h04;

import java.applet.Applet;
import java.awt.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(125,250, 275, 250);
    g.drawLine(200, 50, 125, 250);
    g.drawLine(200, 50, 275, 250);
    }
}
