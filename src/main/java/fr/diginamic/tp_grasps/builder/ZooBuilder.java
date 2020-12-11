package fr.diginamic.tp_grasps.builder;

import fr.diginamic.tp_grasps.beans.Animal;
import fr.diginamic.tp_grasps.beans.Zone;
import fr.diginamic.tp_grasps.beans.Zoo;
import fr.diginamic.tp_grasps.exception.ZoneException;

public class ZooBuilder {
    private Zoo zoo;

    public ZooBuilder(String nom) {
        this.zoo = new Zoo(nom);
    }

    public ZooBuilder appendZone(String nom, int capacite) {
        this.zoo.getZones().add(new Zone(nom, capacite));
        return this;
    }

    public ZooBuilder appendAnimal(String nom, Animal animal) throws ZoneException {
        // retrouver la zone dans liste de zones du zoo
        Zone zone = null;
        for (Zone z : zoo.getZones()) {
            if(z.getNom().equals(nom)) {
                zone = z;
                break;
            }
        }
        if(zone!=null) {
            if(zone.getAnimaux().size() < zone.getCapacite() ) {
                zone.getAnimaux().add(animal);
            } else {
                throw new ZoneException("La zone " + nom + "est pleine, impossible d'ajouter un nouvel animal");
            }

        } else {
            throw new ZoneException("La zone " + nom + " n'existe pas");
        }
        return this;
    }

    public Zoo getZoo() {
        return this.zoo;
    }

}
