package DAO;

import java.util.ArrayList;

import objMetier.Abonnement;

public interface AbonnementDAO extends DAO<Abonnement>{

	boolean create(Abonnement objet);

	boolean update(Abonnement objet);

	boolean delete(Abonnement objet);

	ArrayList<Abonnement> findAll();

	Abonnement getById(int id, int id1, int id2);

}
