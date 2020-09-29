package h04;

import java.applet.Applet;
import java.awt.*;

public class DobbelsteenVier extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //zijde 4
        g.drawLine(75,100,75,250);
        g.drawLine(250,120,250,270);
        g.drawLine(75,100,250,120);
        g.drawLine(75,250,250,270);
        //zijde 5
        g.drawLine(250,120,325,100);
        g.drawLine(250,270,325, 250);
        //zijde 6

    }
}
