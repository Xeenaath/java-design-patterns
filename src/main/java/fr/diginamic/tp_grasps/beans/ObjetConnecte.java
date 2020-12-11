package fr.diginamic.tp_grasps.beans;

public abstract class  ObjetConnecte {
    private int limiteVolts;

    public int getLimiteVolts() {
        return limiteVolts;
    }

    public void setLimiteVolts(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    public ObjetConnecte(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    }
}
