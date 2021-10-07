package cpoa_td1;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class MySQLAbonnementDAO implements DAO<Abonnement>{

	private static MySQLAbonnementDAO instance;

    private MySQLAbonnementDAO() {}

    public static MySQLAbonnementDAO getInstance() {
    if (instance==null) {
    instance = new MySQLAbonnementDAO();
    }
    return instance;
    }
    @Override
    public Abonnement getById(int id) {
    Abonnement abonnement =null;
    try {
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Abonnement where id_abonnement=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return abonnement;

    }
    }catch (SQLException sqle) {
        System.out.println("Erreur connexion" + sqle.getMessage());
        }
    return abonnement;
}

    @Override
    public boolean create(Abonnement objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("insert into Abonnement (id_abonnement, date_debut, date_fin, id_client, id_revue) values(?,?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
                
    }

    @Override
    public boolean update(Abonnement objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("UPDATE Abonnement set id_abonnement =? where id_abonnement =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
        
    }

    @Override
    public boolean delete(Abonnement objet) {
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("delete from Abonnement where id_abonnement=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;

    }

    @Override
    public ArrayList<Abonnement> findAll3() {
       
    	 ArrayList<Abonnement> abonnement =null;
    	    try {
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Abonnement");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return abonnement;

    	    }
    	    }catch (SQLException sqle) {
    	        System.out.println("Erreur connexion" + sqle.getMessage());
    	        }
    	    return abonnement;
    }

	@Override
	public ArrayList<Periodicite> findAll() {
		// TODO Auto-generated method stub
		return null;
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
}
