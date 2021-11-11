package DAO;

import java.util.ArrayList;

import objMetier.Abonnement;
import objMetier.Client;
import objMetier.Periodicite;
import objMetier.Revue;

import java.sql.SQLException;

public interface DAO<T> {
	public abstract T getById(int id) throws SQLException;
	public abstract boolean create(T objet) throws SQLException;
	public abstract boolean update(T objet) throws SQLException;
	public abstract boolean delete(T objet) throws SQLException;
	ArrayList<T> findAll() throws SQLException;
	

}
