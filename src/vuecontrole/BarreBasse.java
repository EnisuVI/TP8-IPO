package vuecontrole;

import javax.swing.*;
import java.awt.*;

public class BarreBasse extends JPanel {
    public JLabel message;
    public JLabel abscisse;
    public JLabel ordonnee;

    public BarreBasse(){
        super();
        this.message = new JLabel("Joyeux Noël !");
        this.abscisse = new JLabel("x : ");
        this.ordonnee = new JLabel("y : ");
        this.add(message);
        this.add(abscisse);
        this.add(ordonnee);
        this.setBackground(Color.green);
        this.setForeground(Color.white);
    }

    public void setMessage(JLabel message) {
        this.message = message;
    }

    public void setAbscisse(JLabel abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(JLabel ordonnee) {
        this.ordonnee = ordonnee;
    }
}
