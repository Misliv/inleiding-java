package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak;

    public void init() {
        tekstvak = new TextField[5];
        for (int teller = 0; teller < tekstvak.length; teller++)
            tekstvak[teller] = new TextField();
        add(tekstvak[teller]);
        Arrays.sort(tekstvak);
    }

    public void paint(Graphics g) {

    }
}
