package modele;

import java.awt.*;

public class Rectangle extends Forme {
    private Point pInit;
    private Point pFin;

    public Rectangle(Color color, Point pInit, Point pFin) {
        super(color);
        this.pInit = new Point(pInit);
        this.pFin = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        g.drawRect(pInit.getX(), pInit.getY(), pFin.getX(), pFin.getY());
    }
}
