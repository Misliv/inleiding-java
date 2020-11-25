package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_4 extends Applet {
    int[] getal = new int[1];
    TextField tekstvak;
    Button okknop;

    public void init() {
        okknop = new Button("Ok");
        okknop.addActionListener(new OkknopListener());
        tekstvak = new TextField("", 5);
        add(okknop);
        add(tekstvak);
        for (int teller = 0; teller < getal.length; teller++) {
        }
    }
    public void paint(Graphics g) {

            }
            class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.getText("");
            repaint();
            for (int teller = 0; teller < getal.length; teller++);
        }

    }
}
