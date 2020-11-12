package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int width = 10;
        int height = 10;
        int x = 200;
        int y = 150;

        while (teller <= 4) {
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, width, height);
            teller++;

        }
    }
}

