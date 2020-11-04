package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    String s, text;
    int maand;

    public void init() {
        tekstvak = new TextField("",10);
        tekstvak.addActionListener( new TekstvakListener());
        text = "";
        add(tekstvak);

    }

    public void paint(Graphics g) {

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    text = "Januari, 31";
                    break;
                case 2:
                    text = "Februari, 28";
                    break;
                case 3:
                    text = "Maart, 31";
                    break;
                case 4:
                    text = "April, 31";
                    break;
                case 5:
                    text = "Mei, 31";
                    break;
                case 6:
                    text = "Juni, 31";
                    break;
                case 7:
                    text = "Juli, 31";
                    break;
                case 8:
                    text = "Augustus, 31";
                    break;
                case 9:
                    text = "September, 31";
                    break;
                case 10:
                    text = "Oktober, 31";
                    break;
                case 11:
                    text = "November, 31";
                    break;
                case 12:
                    text = "December, 31";
                    break;
            }
        }
    }
}

