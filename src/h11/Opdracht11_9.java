package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {
    static int N = 8;

    public void paint(Graphics g)
    {
        int x;
        int y;
        for (int rij = 0; rij < N; rij++) {

            for (int kolom = 0; kolom < N; kolom++) {
                x = rij * 20;
                y = kolom * 20;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}