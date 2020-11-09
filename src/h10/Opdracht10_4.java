package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {
    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label labelmaand;
    Label labeljaar;
    String stringmaand;
    String stringjaar;
    int maand;
    int jaar;


    public void init() {
        tekstvakmaand = new TextField("", 5);
        labelmaand = new Label("Give a number from 1-12");
        tekstvakmaand.addActionListener(new Opdracht10_4.TekstvakListener());
        tekstvakjaar = new TextField("", 5);
        labeljaar = new Label("Name a year");
        tekstvakjaar.addActionListener(new TekstvakListener());
        add(labelmaand);
        add(tekstvakmaand);
        add(labeljaar);
        add(tekstvakjaar);

    }

    public void paint(Graphics g) {
        g.drawString(stringmaand, 50, 50);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringmaand = tekstvakmaand.getText();
            maand = Integer.parseInt(stringmaand);
            stringjaar = tekstvakjaar.getText();
            jaar = Integer.parseInt(stringjaar);
            switch (maand) {
                case 1:
                    stringmaand = "Januari, 31";
                    break;
                case 2:
                    if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                            jaar % 400 == 0 )
                        stringmaand = "Februari, 29";
                        else stringmaand = "Februari, 28";
                    break;
                case 3:
                    stringmaand = "Maart, 31";
                    break;
                case 4:
                    stringmaand = "April, 30";
                    break;
                case 5:
                    stringmaand = "Mei, 31";
                    break;
                case 6:
                    stringmaand = "Juni, 30";
                    break;
                case 7:
                    stringmaand = "Juli, 31";
                    break;
                case 8:
                    stringmaand = "Augustus, 31";
                    break;
                case 9:
                    stringmaand = "September, 30";
                    break;
                case 10:
                    stringmaand = "Oktober, 31";
                    break;
                case 11:
                    stringmaand = "November, 30";
                    break;
                case 12:
                    stringmaand = "December, 31";
                    break;
                default:
                    stringmaand = "Give a number from 1-12";
                    break;

            }
            repaint();
        }
    }
}
