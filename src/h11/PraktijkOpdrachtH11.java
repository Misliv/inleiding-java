package h11;

import h11.PraktijkOpdrachtH11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH11 extends Applet {
    TextField tekstvak;
    Label label;
    Button Okknop;
    String s;
    double gegevengetal;
    int getal2 = 1;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Voer getal in");
        Okknop = new Button("Ok");
        Okknop.addActionListener(new GetalListener());
        add(label);
        add(tekstvak);
        add(Okknop);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;

        while(teller <= 10) {
            y += 20;
            g.drawString("" + teller * gegevengetal,50,y);
            teller++;
        }
            }
            class GetalListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {

                    s = tekstvak.getText();
                    gegevengetal =  Double.parseDouble( s );
                    repaint();
        }
    }
}