package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_2 extends Applet {
    TextField nummerveld;
    String nummer;
    Label label;
    double hoogstegetal;
    double getal1;
    double getal2;
    double laagstegetal;
    double getal3;
    double getal4;

    public void init() {
        nummerveld = new TextField("", 5);
        nummerveld.addActionListener(new FieldListener());
        nummer = "";
        add(nummerveld);
        label = new Label("Give a number");
        add(label);
    }
    public void paint(Graphics g){
        g.drawString("Highest number: " + getal2, 50,50);
        g.drawString("Lowest number: " + getal4, 50,70);
    }

    class FieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = nummerveld.getText();
            getal1 = Double.parseDouble(s);
            if (getal1 > hoogstegetal) {
                hoogstegetal = getal1;
                getal2 = hoogstegetal;
                repaint();
            }
            getal3 = Double.parseDouble(s);
            if (getal3 < getal1) {
                getal1 = getal3;
                getal4 = getal1;
                repaint();
            }

        }
    }
}
