package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {
    int onvoldoende;
    int voldoende;
    TextField tekstvak;
    Label label;
    String tekst;
    Button Okknop;

    public void init() {
        tekstvak = new TextField(" ", 5);
        tekstvak.addActionListener( new TekstListener());
        tekst = "";
        label = new Label ("Input grades");
        Okknop = new Button("Ok");
        Okknop.addActionListener(new KnopListener());
        add (label);
        add (tekstvak);
    }
    public void paint(Graphics g) {
    }
    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            onvoldoende = Integer.parseInt(tekst);
            if (onvoldoende < 5.5)
                tekst = "Onvoldoende";

        }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

            }
        }
    }
}
