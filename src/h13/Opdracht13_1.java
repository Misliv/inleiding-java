package h13;

import javafx.scene.shape.Line;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_1 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 200, 125, 100,250,300,250);

    }
    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}
