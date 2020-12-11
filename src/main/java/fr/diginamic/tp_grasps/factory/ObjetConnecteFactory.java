package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.*;

public class ObjetConnecteFactory {
    public static ObjetConnecte getInstance(TypeObjetConnecte typeObjetConnecte, int limiteVolts) {
        ObjetConnecte objetConnecte = null;
        switch (typeObjetConnecte) {
            case TELEPHONE:
                objetConnecte = new TelephonePortable(limiteVolts);
                break;
            case ENCEINTE:
                objetConnecte = new Enceinte(limiteVolts);
                break;

            case TABLETTE:
                objetConnecte = new Tablette(limiteVolts);
                break;

            default:
                break;
        }
        return objetConnecte;
    }
}
