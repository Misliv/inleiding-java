package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_1 extends Applet {
    Color opvulkleur;
    Color opvulkleurtwee;
    Color lijnkleur;
    int width;
    int height;
    int cirkelwidth;
    int cirkelheight;
    int rechthoekgeelwidth;
    int rechthoekgeelheight;

    public void init() {
        opvulkleur = Color.magenta;
        opvulkleurtwee = Color.YELLOW;
        lijnkleur = Color.BLACK;
        width = 225;
        height = 100;
        cirkelheight = 100;
        cirkelwidth = 100;
        rechthoekgeelwidth = 225;
        rechthoekgeelheight = 14;
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawString("Lijn",130,40);
        g.drawLine(25,20,250,20);

        //Rechthoek
        g.drawString("Rechthoek", 110,180);
        g.drawRect(25,60,width,height);

        //Afgeronde rechthoek
        g.drawString("Afgeronde rechthoek", 82, 320);
        g.drawRoundRect(25,200,width,height,30,30);

        //Gevulde rechthoek met ovaal
        g.drawString("Gevulde rechthoek met ovaal", 293, 180);
        g.setColor(opvulkleur);
        g.fillRect(260,60,width,height);
        g.setColor(lijnkleur);
        g.drawOval(260,60,width,height);

        //Gevulde ovaal
        g.drawString("Gevulde ovaal", 331,319);
        g.setColor(opvulkleur);
        g.fillOval(260,199,width,height);

        //Taartpunt met ovaal eromheen
        g.setColor(opvulkleurtwee);
        g.fillOval(494,60,width,height);
        g.fillArc(494,70,width,height,185,170);
        g.fillRect(494,110,rechthoekgeelwidth,rechthoekgeelheight);
        g.setColor(opvulkleur);
        g.fillArc(494,60,width,height,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",520,189);
        g.drawOval(494,60,width,height);
        g.drawArc(494,70,width,height,185,170);
        g.drawLine(494,110,494,123);
        g.drawLine(718,112,718,123);

        //Cirkel
        g.drawString("Cirkel",589,325);
        g.drawOval(555,209,cirkelwidth,cirkelheight);

    }
}
