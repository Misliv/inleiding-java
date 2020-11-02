package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {
    Button Okknop;
    TextField Textfield;
    Label label;
    String s;
    double prijs;

    public void init() {
        Textfield = new TextField("", 20);
        label = new Label("Voer een prijs in");
        Okknop = new Button("Ok");
        Okknop.addActionListener( new OkknopListener() );
        add (label);
        add (Textfield);
        add (Okknop);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("prijs + btw: " + prijs / 100 * 121, 40,40);

    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Textfield.getText();
            prijs =  Double.parseDouble( s );
            repaint();
        }
    }
}

