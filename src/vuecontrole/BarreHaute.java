package vuecontrole;

import modele.EnumCouleur;

import javax.swing.*;
import java.awt.*;

public class BarreHaute extends JPanel {
    private JComboBox couleurs;

    public BarreHaute(){
        super();
        couleurs = new JComboBox<>(EnumCouleur.values());
        this.add(couleurs);
        this.setBackground(Color.green);
        this.setForeground(Color.white);
    }
}
