package cpoa_td1;

import java.util.ArrayList;

public interface AbonnementDAO {

	boolean create(Abonnement objet);

	boolean update(Abonnement objet);

	boolean delete(Abonnement objet);

	ArrayList<Abonnement> findAll();

	Abonnement getById(int id, int id1, int id2);

}
