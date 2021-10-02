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
	public void InsererPeriodicite(int value, String libelle) {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement req = laConnexion.prepareStatement("insert into Periodicite (id_periodicite, libelle) values("+value+","+libelle+")", 
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
	public void SupprimerPeriodicite(int value) {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement requete = 
				   laConnexion.prepareStatement("delete from Periodicite where id_periodicite="+value+"");
		   
		   int nbLignes = requete.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	public void ModifierPeriodicite(int value, int value1, String libelle, int value2) {
		  try {
		   Connection laConnexion = creeConnexion();
		   Connection laConnexion2 = creeConnexion();
		   
		   Statement stmt = laConnexion.createStatement();
		   String sql = "UPDATE Periodicite set id_periodicite ="+value+"  where id_periodicite ="+value1+"";
		   stmt.executeUpdate(sql);
		   
		   Statement stmt2 = laConnexion2.createStatement();
		   String sql2 = "UPDATE Periodicite set libelle ="+libelle+"  where id_periodicite ="+value2+"";
		   stmt2.executeUpdate(sql2);
		   
		   
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = stmt.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	public void InsererRevue(int id_revue, String titre, String description, float tarif_num, String visuel, int id_periodicite) {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement req = laConnexion.prepareStatement("insert into Revue (id_revue, titre, description, tarif_numero, visuel, id_periodicite) values("+id_revue+","+titre+","+description+","+tarif_num+","+visuel+","+id_periodicite+")", 
					Statement.RETURN_GENERATED_KEYS);
		   
		   int nbLignes = req.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select description from Revue");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
	}
	public void SupprimerRevue(int id_revue) {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement requete = 
				   laConnexion.prepareStatement("delete from Revue where id_revue="+id_revue+"");
		   
		   int nbLignes = requete.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select description from Revue");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	public void ModifierRevue( int id_revue, int id_revue1, int id_periodicite, int id_periodicite1) {
		  try {
		   Connection laConnexion = creeConnexion();
		   Connection laConnexion2 = creeConnexion();
		   
		   
		   Statement stmt2 = laConnexion2.createStatement();
		   String sql2 = "UPDATE Revue set id_revue ="+id_revue+"  where id_revue ="+id_revue1+"";
		   stmt2.executeUpdate(sql2);
		   
		   Statement stmt = laConnexion.createStatement();
		   String sql = "UPDATE Revue set id_periodicite ="+id_periodicite+"  where id_periodicite ="+id_periodicite1+"";
		   stmt.executeUpdate(sql);
		   
		   
		Statement requete2 = laConnexion.createStatement();
		ResultSet res = stmt.executeQuery("select id_revue from Revue");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
		}
	
}
