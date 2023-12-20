package modele;

import java.awt.*;

public class Triangle extends Forme{
    private Point pInit;
    private Point pFin;

    public Triangle(Color color, Point pInit, Point pFin) {
        super(color);
        this.pInit = new Point(pInit);
        this.pFin = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        //g.drawPolygon(pInit.getX(), pInit.getY(), pFin.getX(), pFin.getY());
    }
}
