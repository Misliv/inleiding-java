package h04;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //diagram
        g.drawLine(75,50,75,275);
        g.drawLine(75,275,325,275);
        //Valerie
        g.drawRect(100, 10,51,265);
        //Jeroen
        g.drawRect(176, 10,51,265);
        //Hans
        g.drawRect(252, 10,51,265);

    }
}
