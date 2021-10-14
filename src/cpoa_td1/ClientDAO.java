package cpoa_td1;

import java.util.ArrayList;

public interface ClientDAO {

	boolean create(Client objet);

	boolean update(Client objet);

	boolean delete(Client objet);

	ArrayList<Client> findAll();

	Client getById(int id);

}
