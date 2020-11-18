package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht2H11 extends Applet {
    Button Okknop;
    int getal2 = 1;

    public void init() {
        Okknop = new Button("Ok");
        Okknop.addActionListener(new GetalListener());
        add(Okknop);

    }

    public void paint(Graphics g) {
        int teller = 0;
        int nummer;
        int y = 20;

        while(teller <= 10) {
            y += 20;
            nummer = teller * getal2;
            g.drawString("" + nummer,50,y);
            teller++;
        }
    }
    class GetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (getal2 == 10) {
                getal2 = 0;
            }
            getal2++;
            repaint();
        }
    }
}