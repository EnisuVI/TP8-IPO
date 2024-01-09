package vuecontrole;

import modele.EnumCouleur;
import modele.EnumForme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarreHaute extends JPanel implements ActionListener {
    private JComboBox couleurs;
    private JComboBox formes;
    private JButton effacer;
    private JButton defaire;
    public BarreHaute(){
        super();
        couleurs = new JComboBox<>(EnumCouleur.values());
        formes = new JComboBox<>(EnumForme.values());
        effacer = new JButton("Effacer");
        defaire = new JButton("Défaire");
        this.add(couleurs);
        this.add(formes);
        this.add(effacer);
        this.add(defaire);
        couleurs.addActionListener(this);
        formes.addActionListener(this);
        effacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        defaire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.setBackground(Color.green);
        this.setForeground(Color.white);
    }

    public EnumCouleur getCouleurSelectionne(){
        return(EnumCouleur) this.couleurs.getSelectedItem();
    }
    public EnumForme getFormeSelectionne(){
        return(EnumForme) this.formes.getSelectedItem();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox selectionnee = (JComboBox) e.getSource();
        System.out.println("Valeur sélectionnée : " + selectionnee.getSelectedItem());
    }
}
