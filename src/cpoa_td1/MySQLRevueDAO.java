package cpoa_td1;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MySQLRevueDAO implements DAO<Revue>{

    private static MySQLRevueDAO instance;

    private MySQLRevueDAO() {}

    public static MySQLRevueDAO getInstance() {
    if (instance==null) {
    instance = new MySQLRevueDAO();
    }
    return instance;
    }
    @Override
    public Revue getById(int id) {
    Revue revue =null;
    try {
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Revue where id_revue=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return revue;

    }
    }catch (SQLException sqle) {
        System.out.println("Erreur connexion" + sqle.getMessage());
        }
    return revue;
}

    @Override
    public boolean create(Revue objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("insert into Revue (id_revue, titre, description, tarif_numero, visuel, id_periodicite) values(?,?,?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
                
    }

    @Override
    public boolean update(Revue objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("UPDATE Revue set id_revue =? where id_revue =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
        
    }

    @Override
    public boolean delete(Revue objet) {
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("delete from Revue where id_revue=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;

    }

    @Override
    public ArrayList<Revue> findAll1() {
       
    	 ArrayList<Revue> revue =null;
    	    try {
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Revue");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return revue;

    	    }
    	    }catch (SQLException sqle) {
    	        System.out.println("Erreur connexion" + sqle.getMessage());
    	        }
    	    return revue;
    }

	@Override
	public ArrayList<Periodicite> findAll() {
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
