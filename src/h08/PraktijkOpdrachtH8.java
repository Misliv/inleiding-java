package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH8 extends Applet {
    public class Opdracht8_3 extends Applet {
        Button plus;
        Button min;
        Button vermenigvuldig;
        Button delen;
        TextField Textfield1;
        TextField Textfield2;
        double getal1;
        double getal2;
        double antwoord;

        public void init() {
            Textfield1 = new TextField("", 20);
            Textfield2 = new TextField("", 40);
            add (Textfield1);
            add (Textfield2);
            //plus
            plus = new Button("+");
            plus.addActionListener(new PraktijkOpdrachtH8.plusListener());
            add (plus);

            //min
            min = new Button("-");
            min.addActionListener(new PraktijkOpdrachtH8.minListener());
            add (min);

            //vermenigvuldig
            vermenigvuldig = new Button("*");
            vermenigvuldig.addActionListener(new PraktijkOpdrachtH8.vermenigvuldigListener());
            add (vermenigvuldig);

            //delen
            delen = new Button("/");
            delen.addActionListener(new PraktijkOpdrachtH8.delenListener());
            add (delen);

        }
    }

        public void paint(Graphics g) {

        }

        class plusListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            }
        }
        class minListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            }
        }
        class vermenigvuldigListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            }
        }
        class delenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            }
        }
    }

