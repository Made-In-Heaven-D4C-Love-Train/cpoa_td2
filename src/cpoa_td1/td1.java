package cpoa_td1;
import java.sql.*;
import java.util.Scanner;
public class td1 {
	
	public Connection creeConnexion() {
		String url = 
		"jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/stancato4u_CPOA";
		String login = "stancato4u_appli";
		String pwd = "32020304"; 
		Connection maConnexion = null;
		try { 
		maConnexion = DriverManager.getConnection(url, login, pwd);
		} catch (SQLException sqle) {
		System.out.println("Erreur connexion" + sqle.getMessage());
		}
		return maConnexion;
		  }
	public void InsererPeriodicite() {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement req = laConnexion.prepareStatement("insert into Periodicite (id_periodicite, libelle) values(4, 'bonsoir')", 
					Statement.RETURN_GENERATED_KEYS);
		   
		   int nbLignes = req.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
		  
	   
   
	   
   }
	public void SupprimerPeriodicite() {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement requete = 
				   laConnexion.prepareStatement("delete from Periodicite where id_periodicite=3");
		   
		   int nbLignes = requete.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	public void ModifierPeriodicite() {
		  try {
		   Connection laConnexion = creeConnexion();
		   Connection laConnexion2 = creeConnexion();
		   PreparedStatement requete = 
				   laConnexion.prepareStatement("delete from Periodicite where id_periodicite=2");
		   
		   PreparedStatement req = laConnexion2.prepareStatement("insert into Periodicite (id_periodicite, libelle) values(65, 'bonsoir')", 
					Statement.RETURN_GENERATED_KEYS);
		   
		   int nbLignes = requete.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		   
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	
	
		
}
