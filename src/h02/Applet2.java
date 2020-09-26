package h02;

import java.applet.Applet;
import java.awt.*;

public class Applet2 extends Applet {
    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("May", 50, 50);
        g.setColor(Color.RED);
        g.drawString("Hoang", 50, 65);

    }
}
