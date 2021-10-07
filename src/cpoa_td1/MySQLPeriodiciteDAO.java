package cpoa_td1;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MySQLPeriodiciteDAO implements DAO<Periodicite>{

    private static MySQLPeriodiciteDAO instance;

    private MySQLPeriodiciteDAO() {}

    public static MySQLPeriodiciteDAO getInstance() {
    if (instance==null) {
    instance = new MySQLPeriodiciteDAO();
    }
    return instance;
    }
    @Override
    public Periodicite getById(int id) {
    Periodicite periodicite =null;
    try {
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Periodicite where id_periodicite=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return periodicite;

    }
    }catch (SQLException sqle) {
        System.out.println("Erreur connexion" + sqle.getMessage());
        }
    return periodicite;
}

    @Override
    public boolean create(Periodicite objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("insert into Periodicite (id_periodicite, libelle) values(?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
                
    }

    @Override
    public boolean update(Periodicite objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("UPDATE Periodicite set id_periodicite =? where id_periodicite =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
        
    }

    @Override
    public boolean delete(Periodicite objet) {
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("delete from Periodicite where id_periodicite=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;

    }

    @Override
    public ArrayList<Periodicite> findAll() {
       
    	 ArrayList<Periodicite> periodicite =null;
    	    try {
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Periodicite");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return periodicite;

    	    }
    	    }catch (SQLException sqle) {
    	        System.out.println("Erreur connexion" + sqle.getMessage());
    	        }
    	    return periodicite;
    }

	@Override
	public ArrayList<Revue> findAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Client> findAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Abonnement> findAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
