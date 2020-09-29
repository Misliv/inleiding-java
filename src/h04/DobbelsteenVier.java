package h04;

import java.applet.Applet;
import java.awt.*;

public class DobbelsteenVier extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //zijde 4
        g.drawLine(100,90,100,240);
        g.drawLine(200,120,200,270);
        g.drawLine(100,90,200,120);
        g.drawLine(100,240,200,270);
        g.fillOval(105,105,25,35);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        //zijde 5
        g.drawLine(200,120,315,100);
        g.drawLine(200,270,315, 250);
        g.drawLine(315,100,315,250);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        //zijde 6
        g.drawLine(100,90,215,70);
        g.drawLine(215,70,315,100);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);
        g.fillOval(10,10,10,10);

    }
}
