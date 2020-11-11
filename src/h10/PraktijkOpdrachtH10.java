package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH10 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    String cijfer;
    int getal;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new TekstListener());
        label = new Label("Voer cijfer van 1-10 in");
        add (tekstvak);
        add(label);

    }

    public void paint(Graphics g) {
        g.drawString(cijfer,50,50);

    }
    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            switch (getal) {
                case 1:
                    cijfer = "Slecht";
                    break;
                case 2:
                    cijfer = "Slecht";
                    break;
                case 3:
                    cijfer = "Slecht";
                    break;
                case 4:
                    cijfer = "Onvoldoende";
                    break;
                case 5:
                    cijfer = "Matig";
                    break;
                case 6:
                    cijfer = "Voldoende";
                    break;
                case 7:
                    cijfer = "Voldoende";
                    break;
                case 8:
                    cijfer = "Goed";
                    break;
                case 9:
                    cijfer = "Goed";
                    break;
                case 10:
                    cijfer = "Goed";
                    break;
                default:
                    cijfer = "Ongeldig, geef een cijfer van 1-10";

            }
            repaint();
        }
    }
}
