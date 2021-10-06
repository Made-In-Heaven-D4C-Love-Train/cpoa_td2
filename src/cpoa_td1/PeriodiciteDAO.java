package cpoa_td1;

import java.util.ArrayList;

public interface PeriodiciteDAO<T> {
	public abstract T getById(int id);
	public abstract boolean create(T objet);
	public abstract boolean update(T objet);
	public abstract boolean delete(T objet);
	ArrayList<Periodicite> findAll();

}
