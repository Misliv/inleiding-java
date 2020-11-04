package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet{
    TextField nummerveld;
    String nummer;
    double hoogstegetal;
    double getal;

    public void init() {
        nummerveld = new TextField("");
        nummerveld.addActionListener( new FieldListener());
        nummer = "";
    }

    public void paint(Graphics g) {
    }
    class FieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = nummerveld.getText();
            getal = Integer.parseInt(s);
            if (hoogstegetal > getal) {
                nummer = hoogstegetal;
                repaint();
            }

        }
    }
}
