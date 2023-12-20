package vuecontrole;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    private BarreBasse barreBasse;
    private ZoneGraphique zoneGraphique;
    private EcouteurFenetre ecouteurFenetre;

    public Fenetre(){
        super();
        this.setSize(300, 150);
        this.setTitle("Ma première fenêtre !");
        this.setLocation(100, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.barreBasse = new BarreBasse();
        this.add(barreBasse, BorderLayout.SOUTH);
        this.zoneGraphique = new ZoneGraphique(barreBasse);
        this.add(zoneGraphique, BorderLayout.CENTER);
        this.ecouteurFenetre = new EcouteurFenetre();
        this.addWindowListener(ecouteurFenetre);
        this.setVisible(true);
    }

    public static void main(String[] args) {
       Fenetre maFenetre = new Fenetre();
    }
}
