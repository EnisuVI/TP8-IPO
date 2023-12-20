package vuecontrole;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ZoneGraphique extends JPanel implements MouseMotionListener {

    private BarreBasse barreBasse;
    private BarreHaute barreHaute;
    public ZoneGraphique(BarreBasse barreBasse, BarreHaute barreHaute){
        super();
        if(barreBasse != null) this.barreBasse = barreBasse;
        else this.barreBasse = new BarreBasse();
        if(barreHaute != null) this.barreHaute = barreHaute;
        this.addMouseMotionListener(this);
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
}
