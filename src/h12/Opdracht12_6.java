package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_6 extends Applet {
    double[] getal = {14.0, 16.0, 2.0, 7.0, 3.0, 21.0};
    Boolean gevonden;
    TextField tekstvak;
    Button okknop;
    double gezocht;

    public void init() {
        okknop = new Button("Ok");
        okknop.addActionListener(new OkknopListener());
        tekstvak = new TextField("", 20);
        add(okknop);
        add(tekstvak);
        {
            for (int teller = 0; teller < getal.length; teller++) {
                gezocht = getal.length;
                gevonden = false;
            }
        }
        int teller = 0;
        while (teller < getal.length) {
            if (getal[teller] == gezocht) {
                gevonden = true;
            }
            teller++;
        }
    }
    public void paint(Graphics g) {

    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (gevonden == true) {
                tekstvak.setText("De waarde is gevonden, index = " + getal.length);
                repaint();
            }

            else {
                tekstvak.setText("De waarde is niet gevonden.");
            }
            repaint();
        }
    }
}