package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak = {};
    public void init() {
    }

    public void paint(Graphics g) {
        Arrays.sort(tekstvak);
    }
}
