package h12;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_6 extends Applet implements ActionListener {
    double[] getal = {1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 20, 20, 20};
    double gezocht;
    int count;
    TextField tekstvak;
    Button button;


    public void init() {
        button = new Button("Ok");
        button.addActionListener(this);
        tekstvak = new TextField("", 5);
        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {
        g.drawString("Waarde: " + gezocht,50,50);
        g.drawString("Aantal keer laten zien: " + count,50,70);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            gezocht = Double.parseDouble(tekstvak.getText());
            count = 0;
            for(int teller = 0; teller < getal.length; teller++) {
                if (gezocht == getal[teller]) {
                    count++;
                }
            }
            repaint();
        }
    }
}