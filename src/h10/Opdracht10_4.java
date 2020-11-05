package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {
    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label label;
    String s, text;
    int maand;
    int jaar;
    int jaartal;


    public void init() {
        tekstvakmaand = new TextField("", 10);
        label = new Label("Give a number from 1-12 it and press enter");
        tekstvakmaand.addActionListener(new Opdracht10_4.TekstvakListener());
        text = "";
        add(label);
        add(tekstvakmaand);
        jaartal = (jaar / 4);

    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 50);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakmaand.getText();
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
                    text = "April, 30";
                    break;
                case 5:
                    text = "Mei, 31";
                    break;
                case 6:
                    text = "Juni, 30";
                    break;
                case 7:
                    text = "Juli, 31";
                    break;
                case 8:
                    text = "Augustus, 31";
                    break;
                case 9:
                    text = "September, 30";
                    break;
                case 10:
                    text = "Oktober, 31";
                    break;
                case 11:
                    text = "November, 30";
                    break;
                case 12:
                    text = "December, 31";
                    break;
                default:
                    text = "Give a number from 1-12";
                    break;

            }
            repaint();
        }
    }
}
