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
        //the oval is slightly off but oh well
        g.drawString("Gevulde rechthoek met ovaal", 293, 180);
        g.setColor(Color.MAGENTA);
        g.fillRect(260,60,225,100);
        g.setColor(Color.black);
        g.drawOval(260,60,224,99);

        //Gevulde ovaal
        g.drawString("Gevulde ovaal", 331,319);
        g.setColor(Color.magenta);
        g.fillOval(260,199,224,99);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.yellow);
        g.fillOval(494,60,224,99);
        g.fillArc(494,70,224,99,185,170);
        g.fillRect(494,110,225,14);
        g.setColor(Color.MAGENTA);
        g.fillArc(494,60,224,99,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",520,189);
        g.drawOval(494,60,224,99);
        g.drawArc(494,70,224,99,185,170);
        g.drawLine(494,110,494,123);
        g.drawLine(718,112,718,123);

    }
}
