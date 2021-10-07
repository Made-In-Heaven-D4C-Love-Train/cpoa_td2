package cpoa_td1;

import java.util.ArrayList;

public interface PeriodiciteDAO<T> {
	public abstract T getById(int id);
	ArrayList<Periodicite> findAll();
	boolean create(Periodicite objet);
	boolean update(Periodicite objet);
	boolean delete(Periodicite objet);
	

}
