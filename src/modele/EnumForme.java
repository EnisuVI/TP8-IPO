package modele;

import java.awt.*;

public enum EnumForme {
    DROITE ("Droite"),
    RECTANGLE ("Rectangle"),
    OVALE ("Ovale"),
    TRIANGLE ("Triangle"),
    CERCLE ("Cercle"),
    CARRE ("Carre"),
    CERCLEPLEIN ("Cercle plein"),
    CAMION ("Camion");

    private String nom;
    EnumForme(String s) {
        this.nom = s;
    }
    public String getNom() {
        return nom;
    }
}
