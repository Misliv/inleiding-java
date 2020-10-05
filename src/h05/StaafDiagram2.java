package h05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram2 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {

    }

    public void paint(Graphics g) {
        //diagram
        g.drawLine(75,88,75,275);
        g.drawLine(75,275,325,275);
        //KG
        g.drawString("KG", 25, 162);
        g.drawString("0", 65, 275);
        g.drawString("20", 60, 238);
        g.drawString("40", 60, 200);
        g.drawString("60", 60, 163);
        g.drawString("80", 60, 125);
        g.drawString("100", 54, 88);
        //Valerie 40 kg
        g.drawString("Valerie", 105,290);
        g.setColor(Color.red);
        g.fillRect(100, 200,51,75);

        //Jeroen 100 kg
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 181, 290);
        g.setColor(Color.BLUE);
        g.fillRect(176, 88,51,187);
        //Hans 80 kg
        g.setColor(Color.BLACK);
        g.drawString("Hans", 262, 290);
        g.setColor(Color.YELLOW);
        g.fillRect(252, 125,51,150);

    }
}

