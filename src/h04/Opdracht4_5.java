package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_5 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(50, 75, 300,150);
        g.setColor(Color.yellow);
        g.fillArc(50,75,300,150,50,75);

//niet zeker of dit de opdracht was
    }
}
