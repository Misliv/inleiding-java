package h12;

import com.sun.corba.se.spi.servicecontext.SendingContextServiceContext;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_5 extends Applet implements ActionListener {
        double[] getal = {14.0, 16.0, 2.0, 7.0, 3.0, 21.0};
        double gezocht;
        int index;
        Boolean gevonden = false;
        Button okknop;
        TextField tekstvak;
        TextField tekst;

        public void init ()
        {
            okknop = new Button("Ok");
            okknop.addActionListener(this);
            tekstvak = new TextField("", 20);
            tekst = new TextField("", 30);
            add(okknop);
            add(tekstvak);
            add(tekst);

        }

        public void paint (Graphics g){

    }
        public void actionPerformed (ActionEvent e){
        if (e.getSource() == okknop) {
            gezocht = Double.parseDouble(tekstvak.getText());
            int teller = 0;
            while (teller < getal.length) {
                if (getal[teller] == gezocht) {
                    gevonden = true;
                    index = teller;
                    break;
                }
                teller++;
            }
            if (gevonden == true)
                tekst.setText("De waarde is gevonden, index = " + index);

            else
                tekst.setText("De waarde is niet gevonden");
            gevonden = false;
        }
    }
}
