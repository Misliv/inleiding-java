package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH12 extends Applet implements ActionListener {
    String[] namen = {"", "",  "", "", "", "", "", "", "", ""};
    String[] nummer = {"", "", "", "", "", "", "", "", "", ""};
    Button okknop;
    TextField namentekstvak;
    TextField nummertekstvak;
    int teller = 0;

    public void init() {
        okknop = new Button("Ok");
        okknop.addActionListener(this);
        namentekstvak = new TextField("", 10);
        nummertekstvak = new TextField("", 10);
        this.add(namentekstvak);
        this.add(nummertekstvak);
        this.add(okknop);

    }

    public void paint(Graphics g) {
        if (teller == 10) {
            int y = 50;
            for (int count = 0; count < namen.length; count++) {

                y += 20;
                g.drawString("" + namen[count], 50, y);
                g.drawString("" + nummer[count], 100, y);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okknop) {
            namen[teller] = namentekstvak.getText();
            nummer[teller] = nummertekstvak.getText();
            namentekstvak.setText("" + namen[teller]);
            nummertekstvak.setText("" + nummer[teller]);
            teller++;

            {
        repaint();
    }
        }
    }
}
