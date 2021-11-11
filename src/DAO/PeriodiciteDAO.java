package DAO;

import java.util.ArrayList;

import objMetier.Periodicite;

public interface PeriodiciteDAO extends DAO<Periodicite> {
    Periodicite getById(int id);
	ArrayList<Periodicite> findAll();
	boolean create(Periodicite objet);
	boolean update(Periodicite objet);
	boolean delete(Periodicite objet);
	

}
