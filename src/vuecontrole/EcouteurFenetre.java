package vuecontrole;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EcouteurFenetre implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Fenêtre ouverte");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Fermeture de la fenêtre");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Fenêtre fermée");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Passage à l'état d'icône");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Passage à l'état de fenêtre");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Passage en fenêtre active");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Passage en fenêtre inactive");
    }
}
