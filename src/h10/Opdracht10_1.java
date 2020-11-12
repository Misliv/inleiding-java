package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet{
    TextField nummerveld;
    String nummer;
    Label label;
    double hoogstegetal;
    double getal1;
    double getal2;

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
    }

    class FieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = nummerveld.getText();
            getal1 = Double.parseDouble(s);
            if (getal1 > hoogstegetal) {
                hoogstegetal = getal1;
                getal2 = hoogstegetal;
                repaint();
            }

        }
    }
}
