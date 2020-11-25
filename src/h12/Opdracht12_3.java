package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak;
    Button okknop;

    public void init() {
        okknop = new Button("Ok");
        okknop.addActionListener(new OkknopListener());
        tekstvak = new TextField[5];
        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField();
            add(tekstvak[teller]);

        }
        Arrays.sort(tekstvak);
    }

        public void paint (Graphics g){

        }
        class OkknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                TextField.setText("");
            }
        }
    }

