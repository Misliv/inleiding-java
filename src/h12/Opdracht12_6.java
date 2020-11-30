package h12;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_6 extends Applet implements ActionListener {
    double[] getal = {1, 1, 1, 1, 2, 3, 3, 3, 4};
    double nummer;
    TextField tekstvak;
    Button button;

    public void init() {
        button = new Button("oalright");
        button.addActionListener(this);
        tekstvak = new TextField("", 5);
        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            nummer = Double.parseDouble(tekstvak.getText());{
            }
        }
    }
}