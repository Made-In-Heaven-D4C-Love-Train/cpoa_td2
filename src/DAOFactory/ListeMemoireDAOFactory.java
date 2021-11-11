package DAOFactory;

import DAO.AbonnementDAO;
import DAO.ClientDAO;
import DAO.PeriodiciteDAO;
import DAO.RevueDAO;
import mySQLDAO.MySQLAbonnementDAO;
import mySQLDAO.MySQLClientDAO;
import mySQLDAO.MySQLPeriodiciteDAO;
import mySQLDAO.MySQLRevueDAO;

public class ListeMemoireDAOFactory extends DAOFactory {

	@Override
	public ClientDAO getClientDAO() {
		return (ClientDAO) MySQLClientDAO.getInstance();
	}

	@Override
	public PeriodiciteDAO getPeriodiciteDAO() {
		return (PeriodiciteDAO) MySQLPeriodiciteDAO.getInstance();
	}

	@Override
	public AbonnementDAO getAbonnementDAO() {
		return (AbonnementDAO) MySQLAbonnementDAO.getInstance();
	}

	@Override
	public RevueDAO getRevueDAO() {
		return (RevueDAO) MySQLRevueDAO.getInstance();
	}

}
