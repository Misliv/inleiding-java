package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //square house
        g.drawRect(100,125, 200, 150);
        //rectangle door
        g.drawRect(185,215, 30,60);
        //left window
        g.drawRect(125,175,40,40);
        //right window
        g.drawRect(235,175,40,40);
        //roof
        g.drawLine(200,25,100,125);
        g.drawLine(200, 25,300,125);


    }
}
