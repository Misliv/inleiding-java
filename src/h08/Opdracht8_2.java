package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Button mannen;
    Button vrouwen;
    Button potentielemannen;
    Button potentielevrouwen;
    String totaal;
    Label label1;
    Label label2;
    Label label3;
    Label label4;

    public void init() {
        //mannen
        label1 = new Label("Aantal mannen");
        mannen = new Button("");
        mannen.addActionListener(new Opdracht8_2.mannenListener());
        add(label1);
        add(mannen);
        //vrouwen
        label2 = new Label("Aantal vrouwen");
        vrouwen = new Button("");
        vrouwen.addActionListener(new Opdracht8_2.vrouwenListener());
        add(label2);
        add(vrouwen);
        //potentiële mannen
        label3 = new Label("Aantal potentiële mannen");
        potentielemannen = new Button("");
        potentielemannen.addActionListener(new Opdracht8_2.potentielemannenListener());
        add(label3);
        add(potentielemannen);
        //potentiële vrouwen
        label4 = new Label("Aantal potentiële vrouwen");
        potentielevrouwen = new Button("");
        potentielevrouwen.addActionListener(new Opdracht8_2.potentielevrouwenListener());
        add(label4);
        add(potentielevrouwen);


    }

    public void paint(Graphics g) {

    }

    class mannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class vrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

    class potentielemannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }
    class potentielevrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

}

