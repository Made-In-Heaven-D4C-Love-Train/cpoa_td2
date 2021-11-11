package mySQLDAO;
import java.sql.*;
import java.util.List;

import DAO.DAO;
import cpoa_td1.td1;
import objMetier.Periodicite;

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
    public Periodicite getById(int id) throws SQLException {
    Periodicite periodicite =null;
    
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Periodicite where id_periodicite=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return periodicite;

    }
    
    return periodicite;
}

    @Override
    public boolean create(Periodicite objet) throws SQLException {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("insert into Periodicite (libelle) values(?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
        
                
    }

    @Override
    public boolean update(Periodicite objet) throws SQLException {
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("UPDATE Periodicite set id_periodicite =? where id_periodicite =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        
  
        
    }

    @Override
    public boolean delete(Periodicite objet) throws SQLException{
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("delete from Periodicite where id_periodicite=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
        

    }

    @Override
    public ArrayList<Periodicite> findAll() throws SQLException{
       
    	 ArrayList<Periodicite> periodicite =null;
    	   
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Periodicite");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return periodicite;

    	    }
    	    
    	    return periodicite;
    }



}
