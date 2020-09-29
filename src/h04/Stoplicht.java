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
        g.fillRect(190, 200, 20, 300);
        //red light
        g.setColor(Color.RED);
        g.fillOval(180, 85, 40, 40);
        //yellow light
        g.setColor(Color.yellow);
        g.fillOval(180, 130, 40, 40);
        //green light
        g.setColor(Color.GREEN);
        g.fillOval(180,175,40,40);

//dunno why its uneven on the bottom
    }
}
