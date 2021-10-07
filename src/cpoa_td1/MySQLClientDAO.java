package cpoa_td1;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class MySQLClientDAO implements DAO<Client>{
	private static MySQLClientDAO instance;

    private MySQLClientDAO() {}

    public static MySQLClientDAO getInstance() {
    if (instance==null) {
    instance = new MySQLClientDAO();
    }
    return instance;
    }
    @Override
    public Client getById(int id) {
    Client client =null;
    try {
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Client where id_client=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return client;

    }
    }catch (SQLException sqle) {
        System.out.println("Erreur connexion" + sqle.getMessage());
        }
    return client;
}

    @Override
    public boolean create(Client objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("insert into Client (id_client, nom, prenom, no_rue, voie, code_postal, ville, pays) values(?,?,?,?,?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
                
    }

    @Override
    public boolean update(Client objet) {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("UPDATE Client set id_client =? where id_client =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;
        
    }

    @Override
    public boolean delete(Client objet) {
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        try {
            requete = laConnexion.prepareStatement("delete from Client where id_client=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        } catch (SQLException sqle) {
            System.out.println("Pb select " + sqle.getMessage());
          }
        return false;

    }

    @Override
    public ArrayList<Client> findAll2() {
       
    	 ArrayList<Client> revue =null;
    	    try {
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Client");
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
	public ArrayList<Revue> findAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Abonnement> findAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
