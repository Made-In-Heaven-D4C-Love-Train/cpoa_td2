package DAO;

import java.util.ArrayList;

import objMetier.Client;

public interface ClientDAO extends  DAO<Client>{

	boolean create(Client objet);

	boolean update(Client objet);

	boolean delete(Client objet);

	 ArrayList<Client> findAll();

	Client getById(int id);

}
