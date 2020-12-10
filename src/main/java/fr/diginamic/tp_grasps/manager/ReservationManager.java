package fr.diginamic.tp_grasps.manager;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factory.ReservationFactory;

public class ReservationManager implements IReservationManager{

    /** DAO permettant d'accéder à la table des clients */
    private ClientDao clientDao = new ClientDao();

    /** DAO permettant d'accéder à la table des types de réservation */
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    public Reservation creerReservation(String identifiantClient, String typeReservation, String dateReservationStr, int nbPlaces) {
        // 3) Extraction de la base de données des informations client
        Client client = clientDao.extraireClient(identifiantClient);

        // 4) Extraction de la base de données des infos concernant le type de la réservation
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        // 5) Création de la réservation
        Reservation reservation = ReservationFactory.getInstance(client, type, dateReservationStr,nbPlaces);

        // 6) Ajout de la réservation au client
        client.addReservation(reservation);
        return reservation;
    }
}
