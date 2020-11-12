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
            String s2;
            s = nummerveld.getText();
            s2 = nummerveld.getText();
            getal1 = Double.parseDouble(s);
            getal3 = Double.parseDouble(s2);
            if (getal1 > hoogstegetal) {
                hoogstegetal = getal1;
                getal2 = hoogstegetal;
            }
            repaint();
        }
        {
            if (getal3 < laagstegetal){
                laagstegetal = getal3;

            }
            repaint();
        }
    }
}
