package h06;

import java.applet.Applet;
import java.awt.*;

public class SecondenInUurDagJaar extends Applet {
    int a;
    int b;
    int c;
    int uur;
    int dag;
    int jaar;

    public void init() {
        a = 60;
        b = 24;
        c = 365;
        uur = a * a;
        dag = uur * b;
        jaar = dag * c;

    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur" + uur, 10, 20);
        g.drawString("Seconden in een dag" + dag, 10,40);
        g.drawString("Seconden in een jaar" + jaar,10,60);
    }
}
