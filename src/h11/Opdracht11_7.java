package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_7 extends Applet {
    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 2;
        int height = 2;
        int x = 400;
        int y = 300;

        while (teller <= 50) {
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, width, height);
            teller++;

        }
    }
}

