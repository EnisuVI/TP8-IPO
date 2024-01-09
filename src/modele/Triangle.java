package modele;

import java.awt.*;

public class Triangle extends Forme{
    private Point pA;
    private Point pB;

    public Triangle(Color color, Point pInit, Point pFin) {
        super(color);
        pA = new Point(pInit);
        pB = new Point(pFin);
    }

    @Override
    public void seDessiner(Graphics g){
        super.seDessiner(g);
        g.drawPolygon(new int[]{pA.getX(), pB.getX(), pA.getX()}, new int[]{pA.getY(), pB.getY(), pB.getY()}, 3);
    }
}
