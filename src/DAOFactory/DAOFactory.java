package DAOFactory;

import DAO.AbonnementDAO;
import DAO.ClientDAO;
import DAO.PeriodiciteDAO;
import DAO.RevueDAO;
import objMetier.Periodicite;

public abstract class DAOFactory {

public static DAOFactory getDAOFactory(Persistance cible) {
DAOFactory daoF = null;
switch (cible) {
case MYSQL:
daoF = new MySQLDAOFactory();
break;
case ListeMemoire:
daoF = new ListeMemoireDAOFactory();
break;
}
return daoF;
}
public abstract ClientDAO getClientDAO();
public abstract PeriodiciteDAO getPeriodiciteDAO();
public abstract AbonnementDAO getAbonnementDAO();
public abstract RevueDAO getRevueDAO();

}