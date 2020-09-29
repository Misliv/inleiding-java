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
        g.fillOval(170,125,25,35);
        g.fillOval(105,200,25,35);
        g.fillOval(170,220,25,35);
        //zijde 5
        g.drawLine(200,120,315,100);
        g.drawLine(200,270,315, 250);
        g.drawLine(315,100,315,250);
        g.fillOval(205,126,30,35);
        g.fillOval(283,112,29,34);
        g.fillOval(205,225,30,35);
        g.fillOval(283,210,29,34);
        g.fillOval(247,167,30,35);
        //zijde 6
        g.drawLine(100,90,215,70);
        g.drawLine(215,70,315,100);
        g.fillOval(125,84,35,15);
        g.fillOval(160,78,34,14);
        g.fillOval(195,72,33,13);
        g.fillOval(185,102,35,15);
        g.fillOval(220,98,34,14);
        g.fillOval(255,92,33,13);

    }
}
