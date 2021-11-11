package DAOFactory;

import objMetier.Periodicite;
import objMetier.Revue;

public class Main {
	static void main(String[] args) {
		DAOFactory daos = 
				DAOFactory.getDAOFactory(Persistance.MYSQL);
				Periodicite dut2a = daos.getPeriodiciteDAO().getById(1);
				Revue r = new Revue ("titre", "description", 23, "visuel", dut2a);
				daos.getRevueDAO().create(r);
	}
}
