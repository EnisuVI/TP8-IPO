package vuecontrole;


import modele.*;
import modele.Point;
import modele.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

public class ZoneGraphique extends JPanel implements MouseMotionListener, MouseListener {

    private BarreBasse barreBasse;
    private BarreHaute barreHaute;
    private Point pInit;

    private Point pFin;
    private boolean dessine;
    private LinkedList<Forme> formeMemorisee;
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
        this.formeMemorisee = new LinkedList<>();
    }

    private void dessin(){
        EnumForme formeSelectionnee = this.barreHaute.getFormeSelectionne();
        EnumCouleur couleurSelectionnee = this.barreHaute.getCouleurSelectionne();
        Forme forme = null;
        switch (formeSelectionnee){
            case DROITE:
                forme = new Droite(couleurSelectionnee.getColor(), pInit, pFin);
                break;
            case RECTANGLE:
                forme = new Rectangle(couleurSelectionnee.getColor(), pInit, pFin);
                break;
        }
        if(dessine) this.formeMemorisee.removeLast();
        this.formeMemorisee.add(forme);
        this.repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Forme forme : this.formeMemorisee){
            forme.seDessiner(g);
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Souris pressée et déplacée");
        this.pFin = new Point(e.getX(), e.getY());
        this.dessin();
        dessine = true;
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
        dessine = false;
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
