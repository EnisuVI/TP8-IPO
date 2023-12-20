package modele;

import java.awt.*;

public class Droite extends Forme {
    private Point pInit;
    private Point pFin;
    public Droite(Color color, Point pInit, Point pFin) {
        super(color);
        this.pInit = new Point(pInit);
        this.pFin = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        g.drawLine(pInit.getX(), pInit.getY(), pFin.getX(), pFin.getY());
    }
}
