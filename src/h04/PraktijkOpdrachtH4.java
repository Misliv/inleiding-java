package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH4 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        //Lijn
        g.drawString("Lijn",130,40);
        g.drawLine(25,20,250,20);

        //Rechthoek
        g.drawString("Rechthoek", 110,180);
        g.drawRect(25,60,225,100);

        //Afgeronde rechthoek
        g.drawString("Afgeronde rechthoek", 82, 320);
        g.drawRoundRect(25,200,225,100,30,30);

        //Gevulde rechthoek met ovaal
        g.drawString("Gevulde rechthoek met ovaal", 293, 180);
        g.setColor(Color.MAGENTA);
        g.fillRect(260,60,225,100);
        g.setColor(Color.black);
        g.drawOval(260,60,224,99);

    }
}
