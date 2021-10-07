package cpoa_td1;

import java.util.ArrayList;

public interface ClientDAO {

	boolean create(Client objet);

	boolean update(Client objet);

	boolean delete(Client objet);

	Client getById(int id, int id1, int id2);

	ArrayList<Client> findAll();

}
