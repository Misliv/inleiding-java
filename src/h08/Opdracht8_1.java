package h08;

import javax.xml.soap.Text;
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
        Textfield = new TextField("", 20);
        label = new Label("Type something");
        Okknop = new Button("Ok");
        Okknop.addActionListener( new OkknopListener() );
        add (label);
        add (Textfield);
        add (Okknop);
        Resetknop = new Button("Reset");
        Resetknop.addActionListener( new ResetknopListener() );
        add (Resetknop);
    }

    public void paint(Graphics g) {

    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Textfield.setText("Test");
            repaint();
        }
    }

    class ResetknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Textfield.setText("");
            repaint();
        }
    }
}


