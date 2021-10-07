package cpoa_td1;

import java.util.ArrayList;

public interface RevueDAO {

	boolean create(Revue objet);

	boolean update(Revue objet);

	boolean delete(Revue objet);

	ArrayList<Revue> findAll();

	Revue getById(int id, int id1, int id2);

}
