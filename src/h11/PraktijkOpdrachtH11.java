package h11;

import h10.PraktijkOpdrachtH10;
import h11.PraktijkOpdrachtH11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH11 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    String s;
    Button Okknop;
    double gegevengetal;

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
        int getal1 = 10;
        int nummer;
        int y = 20;

        while(teller <= 100) {
            y += 20;
            nummer = teller;
            teller++;
        }
            }
            class GetalListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    s = tekstvak.getText();
        }
    }
}