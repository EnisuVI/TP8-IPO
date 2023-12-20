package modele;

import java.awt.*;

public abstract class Forme {
    private Color color;

    public Forme(Color color) {
        if(color == null) this.color = Color.black;
        this.color = color;
    }

    public void seDessiner(Graphics g){
        if(g != null)  g.setColor(color);
    }
}
