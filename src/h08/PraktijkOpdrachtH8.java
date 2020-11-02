package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH8 extends Applet {
    Button plusknop;
    Button minknop;
    Button vermenigvuldigknop;
    Button delenknop;
    TextField Textfield1;
    TextField Textfield2;
    double getal1;
    double getal2;
    double antwoord;

    public void init() {
        Textfield1 = new TextField("", 10);
        add(Textfield1);
        Textfield2 = new TextField("", 10);
        add(Textfield2);

        //plus
        plusknop = new Button("+");
        plusknop.addActionListener(new PraktijkOpdrachtH8.plusknopListener());
        add(plusknop);

        //min
        minknop = new Button("-");
        minknop.addActionListener(new PraktijkOpdrachtH8.minknopListener());
        add(minknop);

        //vermenigvuldig
        vermenigvuldigknop = new Button("*");
        vermenigvuldigknop.addActionListener(new PraktijkOpdrachtH8.vermenigvuldigknopListener());
        add(vermenigvuldigknop);

        //delen
        delenknop = new Button("/");
        delenknop.addActionListener(new PraktijkOpdrachtH8.delenknopListener());
        add(delenknop);

    }

    public void paint(Graphics g) {

    }

    class plusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

    class minknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

    class vermenigvuldigknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

    class delenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }
}



