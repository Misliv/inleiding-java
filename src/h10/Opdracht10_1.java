package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet{
    TextField nummerveld;
    String nummer;
    Button confirm;
    double hoogstegetal;
    double getal1;
    double getal2;

    public void init() {
        nummerveld = new TextField("",5);
        nummerveld.addActionListener( new FieldListener());
        nummer = "";
        add(nummerveld);
        confirm = new Button("  ");
        confirm.addActionListener( new ConfirmListener());
    }

    public void paint(Graphics g) {
    }

    class FieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;

            s = nummerveld.getText();
            getal1 = Double.parseDouble(s);
            if (hoogstegetal > getal1) {
                hoogstegetal = getal1;

                repaint();
            }

        }
    }
    class ConfirmListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
