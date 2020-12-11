package fr.diginamic.tp_grasps.beans;

import java.util.ArrayList;
import java.util.List;


public class Zone {
    private String nom;
    private int capacite;
    private List<Animal> animaux;

    public Zone(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.animaux = new ArrayList<Animal>();

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }


}
