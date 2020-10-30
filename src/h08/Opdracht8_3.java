package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {
    Button Okknop;
    TextField Textfield;
    Label label;
    String schermtekst;
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
        g.drawString(s,40,40);
        g.drawString("Getal" + prijs, 50,50);

    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Textfield.getText();
            prijs =  Double.parseDouble( s );
            repaint();
        }
    }
}

