package modele;

import java.awt.*;

public enum EnumCouleur {
    ROUGE (Color.red),
    BLEU (Color.blue),
    VERT (Color.green),
    NOIR (Color.black),
    JAUNE (Color.yellow);

    private Color color;
    EnumCouleur(Color color) {
        if(color != null) this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
