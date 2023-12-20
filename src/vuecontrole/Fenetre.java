package vuecontrole;

import javax.swing.*;

public class Fenetre extends JFrame {

    public Fenetre(){
        super();
        this.setSize(300, 150);
        this.setTitle("Ma première fenêtre !");
        this.setLocation(100, 200);
        this.setVisible(true);
    }
    public static void main(String[] args) {
       Fenetre maFenetre = new Fenetre();
    }
}
