package DAO;

import java.util.ArrayList;

import objMetier.Revue;

public interface RevueDAO extends DAO<Revue>{

	boolean create(Revue objet);

	boolean update(Revue objet);

	boolean delete(Revue objet);

	ArrayList<Revue> findAll();

	Revue getById(int id, int id1, int id2);

}
