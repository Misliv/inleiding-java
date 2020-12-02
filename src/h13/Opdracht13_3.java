package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13_3 extends Applet implements ActionListener {
    int baksteen = 10;
    int betonblok = 7;
    Button knopbaksteen;
    Button knopbetonblok;

    public void init() {
        knopbaksteen = new Button("Baksteen");
        knopbetonblok = new Button("Betonblok");
        knopbaksteen.addActionListener(this);
        add(knopbaksteen);
        add(knopbetonblok);

    }
    public void paint(Graphics g) {
        int x;
        int y;
        int x1;
        int y1;
        for (int rij = 3; rij < baksteen; rij++) {
            for (int kolom = 3; kolom < baksteen; kolom++) {
                x = rij * 30;
                y = kolom * 25;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    tekenRodeBaksteen(g, x, y, 50, 20);
            }
        }

        for (int rij = 1; rij < betonblok; rij++) {
            for (int kolom = 1; kolom < betonblok; kolom++) {
                x1 = rij * 45;
                y1 = kolom * 45;
                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    tekenGrijzeBetonblok(g, x1, y1, 70, 40);
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == knopbaksteen) {
        }
        if (e.getSource() == knopbetonblok) {

        }
        repaint();
    }
    void tekenRodeBaksteen (Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
    void tekenGrijzeBetonblok (Graphics g, int x1, int y1, int width, int height) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, width, height);
    }
}

