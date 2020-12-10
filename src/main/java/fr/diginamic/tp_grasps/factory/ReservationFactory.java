package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.service.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

import java.time.LocalDateTime;

public class ReservationFactory {
    // 2) Conversion de la date de réservation en LocalDateTime
    private static ReservationService reservationService = new ReservationService();

    public static Reservation getInstance(Client client, TypeReservation typeReservation, String dateReservationStr, int nbPlaces) {
        LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        reservation.setTotal(reservationService.calculMontant(typeReservation, nbPlaces, client.isPremium()));

        return reservation;
    }
}
