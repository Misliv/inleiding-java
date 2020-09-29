package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH4 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //Lijn
        g.drawString("Lijn",130,40);
        g.drawLine(25,20,250,20);

        //Rechthoek
        g.drawString("Rechthoek", 110,180);
        g.drawRect(25,60,225,100);

    }
}
