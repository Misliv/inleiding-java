package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //black shape
        g.setColor(Color.BLACK);
        g.fillOval(150, 50, 100, 75);
        g.fillRect(150, 85, 100, 125);
        g.fillOval(150,175,100,75);
        //red light
        //yellow light
        //green light

//dunno why its uneven on the bottom
    }
}
