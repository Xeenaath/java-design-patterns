package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

import java.time.LocalDateTime;

public class ReservationFactoryImpl {


    public ReservationFactoryImpl() {
    }

    public Reservation getInstance(LocalDateTime dateReservation, int nbPlaces, Client client) {
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        return reservation;
    }
}
