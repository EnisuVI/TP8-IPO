package vuecontrole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class BarreBasse extends JPanel {
    public JLabel message;
    public JLabel abscisse;
    public JLabel ordonnee;

    public BarreBasse(){
        super();
        this.message = new JLabel("Bonne Année !");
        this.abscisse = new JLabel("x : ");
        this.ordonnee = new JLabel("y : ");
        this.add(message);
        this.add(abscisse);
        this.add(ordonnee);
        this.setBackground(Color.green);
        this.setForeground(Color.white);
    }

    public void deplacementSouris(MouseEvent evt){
        if(evt != null) {
            this.setAbscisse("x :" + Integer.toString(evt.getX()));
            this.setOrdonnee("y :" + Integer.toString(evt.getY()));
        }
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    public void setAbscisse(String abscisse) {
        this.abscisse.setText(abscisse);
    }

    public void setOrdonnee(String ordonnee) {
        this.ordonnee.setText(ordonnee);
    }
}
