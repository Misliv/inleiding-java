package h04;

import java.applet.Applet;
import java.awt.*;

public class NederlandsVlagAanEenVlaggenstok extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //flagpole
        g.drawLine(50,300,50,75);
        g.drawLine(60,300, 60, 75);
        g.drawOval(48,61, 15, 15);

        //flag


    }
}
