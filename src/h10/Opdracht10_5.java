package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {
    double invoercijfer;
    double totaal;
    double aantalcijfer;
    double gemiddelde;
    TextField tekstvak;
    Label label;
    String tekst;
    String s;
    Button Okknop;

    public void init() {
        tekstvak = new TextField(" ", 5);
        tekst = "";
        label = new Label ("Voer in cijfers");
        Okknop = new Button("Ok");
        Okknop.addActionListener(new TekstListener());
        add (label);
        add (tekstvak);
        add (Okknop);

    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50,50);
        g.drawString(gemiddelde + "",50,60);

    }
    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
        invoercijfer = Double.parseDouble(s);
            if (invoercijfer >= 5.5){
                tekst = "Voldoende";
        }
            else {
                tekst = "Onvoldoende";
            }
            totaal += invoercijfer;
            aantalcijfer ++;
            gemiddelde = totaal / aantalcijfer;
            repaint();

        }
        }
            }

