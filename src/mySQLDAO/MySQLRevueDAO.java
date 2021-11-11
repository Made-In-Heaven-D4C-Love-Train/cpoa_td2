package mySQLDAO;

import java.sql.*;
import java.util.List;

import DAO.DAO;
import cpoa_td1.td1;
import objMetier.Revue;

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
    public Revue getById(int id) throws SQLException {
    Revue revue =null;
    
    td1 td = new td1();
    Connection laConnexion = td.creeConnexion();
    PreparedStatement requete = 
    laConnexion.prepareStatement("select * from Revue where id_revue=?");
    requete.setInt(1, id);
    ResultSet res = requete.executeQuery();
    if (res.next()) {

    return revue;

    }
    
    return revue;
}

    @Override
    public boolean create(Revue objet) throws SQLException{
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
       
            requete = laConnexion.prepareStatement("insert into Revue (titre, description, tarif_numero, visuel, id_periodicite) values(?,?,?,?,?)");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
        
                
    }

    @Override
    public boolean update(Revue objet) throws SQLException{
    	td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("UPDATE Revue set id_revue =? where id_revue =?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
        
        
        
    }

    @Override
    public boolean delete(Revue objet) throws SQLException{
        td1 td = new td1();
        Connection laConnexion = td.creeConnexion();
        PreparedStatement requete;
        
            requete = laConnexion.prepareStatement("delete from Revue where id_revue=?");
            int nbLignes = requete.executeUpdate();
            return nbLignes==1;
       
      

    }

    @Override
    public ArrayList<Revue> findAll() throws SQLException {
       
    	 ArrayList<Revue> revue =null;
    	    
    	    td1 td = new td1();
    	    Connection laConnexion = td.creeConnexion();
    	    PreparedStatement requete = 
    	    laConnexion.prepareStatement("select * from Revue");
    	    ResultSet res = requete.executeQuery();
    	    if (res.next()) {

    	    return revue;

    	    }
    	    
    	    return revue;
    }


}
