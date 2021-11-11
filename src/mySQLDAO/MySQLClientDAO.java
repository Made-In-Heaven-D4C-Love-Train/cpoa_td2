package mySQLDAO;
import java.sql.*;
import java.util.List;

import DAO.DAO;
import cpoa_td1.td1;
import objMetier.Client;

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
    public Client getById(int id) throws SQLException{
    Client client =null;
    
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Client where id_client=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return client;

    }
   
    return client;
}

    @Override
    public boolean create(Client objet) throws SQLException{
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("insert into Client (nom, prenom, no_rue, voie, code_postal, ville, pays) values(?,?,?,?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        
      
                
    }

    @Override
    public boolean update(Client objet) throws SQLException {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("UPDATE Client set id_client =? where id_client =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        
        
        
    }

    @Override
    public boolean delete(Client objet) throws SQLException {
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("delete from Client where id_client=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        

    }

    @Override
    public ArrayList<Client> findAll() throws SQLException{
       
    	 ArrayList<Client> revue =null;
    	    
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Client");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return revue;

    	    }
    	    
    	    return revue;
    }

	

}
