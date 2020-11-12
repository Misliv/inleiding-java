package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int getal1 = 0;
        int getal2 = 1;
        int nummer;
        int y = 20;

        while(teller < getal2){
            y +=20;
            nummer = getal1 + getal2;
            getal1 = getal2;
            getal2 = nummer;
            g.drawString("1",50,20);
            g.drawString("" + nummer,50,y);
        }

        }
    }
