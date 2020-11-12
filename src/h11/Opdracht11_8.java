package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {
    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 2;
        int height = 2;
        int x = 10;
        int y = 10;

        while (teller <= 100) {
            width += 10;
            height += 10;
            g.drawOval(x, y, width, height);
            teller++;

        }
    }
}
