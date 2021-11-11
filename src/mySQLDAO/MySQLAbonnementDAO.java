package mySQLDAO;
import java.sql.*;
import java.util.List;

import DAO.DAO;
import cpoa_td1.td1;
import objMetier.Abonnement;

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
    public Abonnement getById(int id) throws SQLException{
    Abonnement abonnement =null;
    
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Abonnement where id_abonnement=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return abonnement;

    }
    
    return abonnement;
}

    @Override
    public boolean create(Abonnement objet) throws SQLException{
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("insert into Abonnement (date_debut, date_fin, id_client, id_revue) values(?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
        
                
    }

    @Override
    public boolean update(Abonnement objet) throws SQLException{
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("UPDATE Abonnement set id_abonnement =? where id_abonnement =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        
        
        
    }

    @Override
    public boolean delete(Abonnement objet) throws SQLException{
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("delete from Abonnement where id_abonnement=?");
            
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
        

    }

    @Override
    public ArrayList<Abonnement> findAll() throws SQLException{
       
    	 ArrayList<Abonnement> abonnement =null;
    	    
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Abonnement");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return abonnement;

    	    }
    	    
    	    return abonnement;
    }

	
}

