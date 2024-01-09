package modele;

import java.awt.*;

public class Camion extends Forme {
    private Point pInit;
    private Point pFin;

    public Camion(Color color, Point pInit, Point pFin) {
        super(color);
        this.pInit = new Point(pInit);
        this.pFin = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        g.drawRect(pInit.getX(), pInit.getY(), pFin.getX() - pInit.getX(), pFin.getY() - pInit.getY());
        g.drawOval(pInit.getX(), pInit.getY(), pFin.getX() - pInit.getX(), pFin.getX() - pInit.getX());

    }
}
