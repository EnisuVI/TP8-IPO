package vuecontrole;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ZoneGraphique extends JPanel implements MouseMotionListener, MouseListener {

    private BarreBasse barreBasse;
    private BarreHaute barreHaute;

    private Point pInit;

    private Point pFin;
    public ZoneGraphique(BarreBasse barreBasse, BarreHaute barreHaute){
        super();
        if(barreBasse != null) this.barreBasse = barreBasse;
        else this.barreBasse = new BarreBasse();
        if(barreHaute != null) this.barreHaute = barreHaute;
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setBackground(Color.white);
        this.pInit = new Point(0,0);
        this.pFin = new Point(0,0);
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
        this.pInit = new Point(e.getX(),e.getY());
        System.out.println(pInit);
        this.barreBasse.setMessage("Relâcher pour voir la forme");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Souris relachée");
        this.pFin = new Point(e.getX(), e.getY());
        System.out.println(pFin);
        this.barreBasse.setMessage("Cliquer pour initier une forme");
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
