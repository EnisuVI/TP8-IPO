package modele;

import java.awt.*;

public class Cercle extends Forme{
    private Point pInit;
    private Point pFin;

    public Cercle(Color color, Point pInit, Point pFin) {
        super(color);
        this.pInit = new Point(pInit);
        this.pFin = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        g.drawOval(pInit.getX(), pInit.getY(), pFin.getX(), pFin.getY());
    }
}
