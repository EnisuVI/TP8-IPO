package modele;

import java.awt.*;

public enum EnumForme {
    DROITE ("Droite"),
    RECTANGLE ("Rectangle"),
    CERCLE ("Cercle"),
    TRIANGLE ("Cercle"),
    CERCLEPLEIN ("Cercle plein");

    private String nom;
    EnumForme(String s) {
        this.nom = s;
    }
    public String getNom() {
        return nom;
    }
}
