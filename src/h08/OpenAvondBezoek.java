package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class OpenAvondBezoek extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        schermtekst = "earth to button?";
        knop = new Button("press me");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "it works!";

        }
    }



}
