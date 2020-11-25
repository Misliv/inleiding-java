package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak = new TextField[5];
    int[] getal = new int[5];
    Button okknop;

    public void init() {
        okknop = new Button("Ok");
        okknop.addActionListener(new OkknopListener());
        add(okknop);
        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("");
            add(tekstvak[teller]);

        }

    }

    public void paint(Graphics g) {
    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < tekstvak.length; teller++) {
                getal[teller] = Integer.parseInt(tekstvak[teller].getText());
            }
            Arrays.sort(getal);
            for (int teller = 0; teller < tekstvak.length; teller++) {
                tekstvak[teller].setText(getal[teller] + "");
            }
            repaint();
        }
    }
}


