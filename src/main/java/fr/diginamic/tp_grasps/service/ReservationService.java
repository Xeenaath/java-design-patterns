package fr.diginamic.tp_grasps.service;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationService {

    public double calculMontant(TypeReservation typeReservation, int nbPlaces, boolean isPremium){
        double total = typeReservation.getMontant() * nbPlaces;
        if (isPremium) {
            return total*(1-typeReservation.getReductionPourcent()/100.0);
        }
        else {
            return total;
        }

    }
}
