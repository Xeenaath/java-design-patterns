package fr.diginamic.tp_grasps.manager;

import fr.diginamic.tp_grasps.beans.Reservation;

public interface IReservationManager {
    Reservation creerReservation(String identifiantClient, String typeReservation, String dateReservationStr, int nbPlaces);
}
