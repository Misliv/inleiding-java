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

        //flag red
        g.setColor(Color.RED);
        g.fillRect(61,75, 250, 50);

        //flag white
        g.setColor(Color.lightGray);
        g.drawLine(310, 125, 310, 175);

        //flag blue
        g.setColor(Color.BLUE);
                g.fillRect(61,175,250,50);


    }
}
