package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_2 extends Applet {
    Button[] knop;

    public void init() {
        knop = new Button[25];
        for (int teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button();
            add(knop[teller]);
        }
    }

        public void paint (Graphics g){

    }
}
