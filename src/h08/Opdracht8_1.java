package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_1 extends Applet {
    Button Okknop;
    Button Resetknop;
    TextField Textfield;
    Label label;
    String schermtekst;
    String s;

    public void init() {
        schermtekst = "Add text";
        Okknop = new Button("Ok");
        KnopListener kl = new KnopListener();
        Okknop.addActionListener( kl );
        add(Okknop);
        Resetknop = new Button("Reset");
        Resetknop.addActionListener( kl );
        add(Resetknop);
        Textfield = new TextField("Type here", 20);
        label = new Label("Type next to me!");
        add(label);
        add(Textfield);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "it works!";
            s = Textfield.getText();
            repaint();

        }
    }
}
