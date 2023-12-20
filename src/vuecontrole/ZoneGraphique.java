package vuecontrole;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ZoneGraphique extends JPanel implements MouseMotionListener, MouseListener {

    private BarreBasse barreBasse;
    private BarreHaute barreHaute;
    public ZoneGraphique(BarreBasse barreBasse, BarreHaute barreHaute){
        super();
        if(barreBasse != null) this.barreBasse = barreBasse;
        else this.barreBasse = new BarreBasse();
        if(barreHaute != null) this.barreHaute = barreHaute;
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setBackground(Color.white);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris pressée et déplacée");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Souris déplacée");
        this.barreBasse.deplacementSouris(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Bouton de la souris cliqué");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Souris pressée sur un composant");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris relachée");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Souris entrée sur un composant");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Souris sortie du composant");
    }
}
