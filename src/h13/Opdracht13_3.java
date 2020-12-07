package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Opdracht13_3 extends Applet implements ActionListener {
    int baksteen = 8;
    int betonblok = 6;
    Button knopbaksteen;
    Button knopbetonblok;
    int decision;

    public void init() {
        setSize(600,300);
        knopbaksteen = new Button("Baksteen");
        knopbetonblok = new Button("Betonblok");
        knopbaksteen.addActionListener(this);
        knopbetonblok.addActionListener(this);
        add(knopbaksteen);
        add(knopbetonblok);

    }

    public void paint(Graphics g) {
        if (decision == 1) {
             tekenRodeBaksteen(g, 50, 50, 50, 20);
        }
        else if (decision == 2) {
               tekenGrijzeBetonblok(g, 50, 50, 70, 40);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == knopbaksteen) {
            decision = 1;
            repaint();
        }
        if (e.getSource() == knopbetonblok) {
            decision = 2;
            repaint();
        }

    }
    void tekenRodeBaksteen (Graphics g, int x, int y, int width, int height) {
        for (int rij = 2; rij < baksteen; rij++) {
            for (int kolom = 2; kolom < baksteen; kolom++) {
                x = rij * 55;
                y = kolom * 25;
                    g.setColor(Color.RED);
                    g.fillRect(x, y, width, height);
            }
        }
    }
            void tekenGrijzeBetonblok (Graphics g,int x1, int y1, int width, int height) {
                for (int rij = 1; rij < betonblok; rij++) {
                    for (int kolom = 1; kolom < betonblok; kolom++) {
                        x1 = rij * 75;
                        y1 = kolom * 45;
                            g.setColor(Color.gray);
                        g.fillRect(x1, y1, width, height);
                    }
                }
    }
}


