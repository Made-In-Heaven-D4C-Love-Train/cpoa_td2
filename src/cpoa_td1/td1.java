package cpoa_td1;
<<<<<<< HEAD
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
>>>>>>> branch 'master' of https://github.com/Made-In-Heaven-D4C-Love-Train/cpoa_td2.git
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
<<<<<<< HEAD
		ResultSet res = requete.executeQuery("select description from Revue");
=======
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
>>>>>>> branch 'master' of https://github.com/Made-In-Heaven-D4C-Love-Train/cpoa_td2.git
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }
	
	}
	public void SupprimerRevue(int id_revue) {
<<<<<<< HEAD
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
	 public void InsererClient(int id_client, String nom, String prenom, int no_rue, String voie, int code_postal, String ville, String pays) {
		  try {
		   Connection laConnexion = creeConnexion();

		   PreparedStatement req = laConnexion.prepareStatement("insert into Client (id_client, nom, prenom, no_rue, voie, code_postal, ville, pays) values("+id_client+","+nom+","+prenom+","+no_rue+","+voie+","+code_postal+","+ville+","+pays+")", 
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
	  public void SupprimerClient(int id_client) {
	      try {
	       Connection laConnexion = creeConnexion();

	       PreparedStatement requete = 
	               laConnexion.prepareStatement("delete from Client where id_client="+id_client+"");

	       int nbLignes = requete.executeUpdate();
	       System.out.println("nombre de lignes : " +nbLignes);
	    Statement requete2 = laConnexion.createStatement();
	    ResultSet res = requete.executeQuery("select description from Revue");
	    System.out.println(res);
	      } catch (SQLException sqle) {
	    System.out.println("Pb select " + sqle.getMessage());
	      }

	    }
	  public void ModifierClient( int id_client, int id_client1, int code_postal, int code_postal1) {
	      try {
	       Connection laConnexion = creeConnexion();
	       Connection laConnexion2 = creeConnexion();


	       Statement stmt2 = laConnexion2.createStatement();
	       String sql2 = "UPDATE Client set id_client ="+id_client+"  where id_client ="+id_client1+"";
	       stmt2.executeUpdate(sql2);

	       Statement stmt = laConnexion.createStatement();
	       String sql = "UPDATE Client set code_postal ="+code_postal+"  where code_postal ="+code_postal1+"";
	       stmt.executeUpdate(sql);


	    Statement requete2 = laConnexion.createStatement();
	    ResultSet res = stmt.executeQuery("select id_revue from Revue");
	    System.out.println(res);
	      } catch (SQLException sqle) {
	    System.out.println("Pb select " + sqle.getMessage());
	      }

	    }
	  public void InsererAbonnement(int id_abonnement, String date_debut, String date_fin, int id_client, int id_revue) {
		  try {
		   Connection laConnexion = creeConnexion();
		   DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		   LocalDate dateDebut = LocalDate.parse(date_debut, formatage);
		   java.sql.Date SQLdateDebut = java.sql.Date.valueOf(dateDebut);
		  // formatage.format(dateDebut);
		   DateTimeFormatter formatage1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		   LocalDate dateFin = LocalDate.parse(date_fin, formatage1);
		   java.sql.Date SQLdateFin = java.sql.Date.valueOf(dateFin);
		  // formatage1.format(dateFin);
		   PreparedStatement req = laConnexion.prepareStatement("insert into Abonnement (id_abonnement, date_debut, date_fin, id_client, id_revue) values(?,?,?,?,?)");
		   req.setInt(1,id_abonnement);
		   req.setDate(2, SQLdateDebut);
		   req.setDate(3, SQLdateFin);
		   req.setInt(4, id_client);
		   req.setInt(5, id_revue);
		   
		   int nbLignes = req.executeUpdate();
		   System.out.println("nombre de lignes : " +nbLignes);
		Statement requete = laConnexion.createStatement();
		ResultSet res = requete.executeQuery("select libelle from Periodicite");
		System.out.println(res);
		  } catch (SQLException sqle) {
		System.out.println("Pb select " + sqle.getMessage());
		  }

	}
	  public void SupprimerAbonnement(int id_abonnement) {
	      try {
	       Connection laConnexion = creeConnexion();

	       PreparedStatement requete = 
	               laConnexion.prepareStatement("delete from Abonnement where id_abonnement="+id_abonnement+"");

	       int nbLignes = requete.executeUpdate();
	       System.out.println("nombre de lignes : " +nbLignes);
	    Statement requete2 = laConnexion.createStatement();
	    ResultSet res = requete.executeQuery("select description from Revue");
	    System.out.println(res);
	      } catch (SQLException sqle) {
	    System.out.println("Pb select " + sqle.getMessage());
	      }

	    }
	  public void ModifierAbonnement( int id_abonnement, int id_abonnement1) {
	      try {
	       Connection laConnexion = creeConnexion();
	       Connection laConnexion2 = creeConnexion();
		  

	       Statement stmt2 = laConnexion2.createStatement();
	       String sql2 = "UPDATE Abonnement set id_abonnement ="+id_abonnement+"  where id_abonnement ="+id_abonnement1+"";
	       stmt2.executeUpdate(sql2);

	              

	    Statement requete2 = laConnexion.createStatement();
	    ResultSet res = stmt2.executeQuery("select id_revue from Revue");
	    System.out.println(res);
	      } catch (SQLException sqle) {
	    System.out.println("Pb select " + sqle.getMessage());
	      }

	    }
=======
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
  public void InsererClient(int id_client, String nom, String prenom, int no_rue, String voie, int code_postal, String ville, String pays) {
	  try {
	   Connection laConnexion = creeConnexion();

	   PreparedStatement req = laConnexion.prepareStatement("insert into Client (id_client, nom, prenom, no_rue, voie, code_postal, ville, pays) values("+id_client+","+nom+","+prenom+","+no_rue+","+voie+","+code_postal+","+ville+","+pays+")", 
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
  public void SupprimerClient(int id_client) {
      try {
       Connection laConnexion = creeConnexion();

       PreparedStatement requete = 
               laConnexion.prepareStatement("delete from Client where id_client="+id_client+"");

       int nbLignes = requete.executeUpdate();
       System.out.println("nombre de lignes : " +nbLignes);
    Statement requete2 = laConnexion.createStatement();
    ResultSet res = requete.executeQuery("select description from Revue");
    System.out.println(res);
      } catch (SQLException sqle) {
    System.out.println("Pb select " + sqle.getMessage());
      }

    }
  public void ModifierClient( int id_client, int id_client1, int code_postal, int code_postal1) {
      try {
       Connection laConnexion = creeConnexion();
       Connection laConnexion2 = creeConnexion();


       Statement stmt2 = laConnexion2.createStatement();
       String sql2 = "UPDATE Client set id_client ="+id_client+"  where id_client ="+id_client1+"";
       stmt2.executeUpdate(sql2);

       Statement stmt = laConnexion.createStatement();
       String sql = "UPDATE Client set code_postal ="+code_postal+"  where code_postal ="+code_postal1+"";
       stmt.executeUpdate(sql);


    Statement requete2 = laConnexion.createStatement();
    ResultSet res = stmt.executeQuery("select id_revue from Revue");
    System.out.println(res);
      } catch (SQLException sqle) {
    System.out.println("Pb select " + sqle.getMessage());
      }

    }
  public void InsererAbonnement(int id_abonnement, String date_debut, String date_fin, int id_client, int id_revue) {
	  try {
	   Connection laConnexion = creeConnexion();
	   DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate dateDebut = LocalDate.parse(date_debut, formatage);
	   java.sql.Date SQLdateDebut = java.sql.Date.valueOf(dateDebut);
	  // formatage.format(dateDebut);
	   DateTimeFormatter formatage1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate dateFin = LocalDate.parse(date_fin, formatage1);
	   java.sql.Date SQLdateFin = java.sql.Date.valueOf(dateFin);
	  // formatage1.format(dateFin);
	   PreparedStatement req = laConnexion.prepareStatement("insert into Abonnement (id_abonnement, date_debut, date_fin, id_client, id_revue) values(?,?,?,?,?)");
	   req.setInt(1,id_abonnement);
	   req.setDate(2, SQLdateDebut);
	   req.setDate(3, SQLdateFin);
	   req.setInt(4, id_client);
	   req.setInt(5, id_revue);
	   
	   int nbLignes = req.executeUpdate();
	   System.out.println("nombre de lignes : " +nbLignes);
	Statement requete = laConnexion.createStatement();
	ResultSet res = requete.executeQuery("select libelle from Periodicite");
	System.out.println(res);
	  } catch (SQLException sqle) {
	System.out.println("Pb select " + sqle.getMessage());
	  }

}
  public void SupprimerAbonnement(int id_abonnement) {
      try {
       Connection laConnexion = creeConnexion();

       PreparedStatement requete = 
               laConnexion.prepareStatement("delete from Abonnement where id_abonnement="+id_abonnement+"");

       int nbLignes = requete.executeUpdate();
       System.out.println("nombre de lignes : " +nbLignes);
    Statement requete2 = laConnexion.createStatement();
    ResultSet res = requete.executeQuery("select description from Revue");
    System.out.println(res);
      } catch (SQLException sqle) {
    System.out.println("Pb select " + sqle.getMessage());
      }

    }
  public void ModifierAbonnement( int id_abonnement, int id_abonnement1) {
      try {
       Connection laConnexion = creeConnexion();
       Connection laConnexion2 = creeConnexion();
	  

       Statement stmt2 = laConnexion2.createStatement();
       String sql2 = "UPDATE Abonnement set id_abonnement ="+id_abonnement+"  where id_abonnement ="+id_abonnement1+"";
       stmt2.executeUpdate(sql2);

              

    Statement requete2 = laConnexion.createStatement();
    ResultSet res = stmt2.executeQuery("select id_revue from Revue");
    System.out.println(res);
      } catch (SQLException sqle) {
    System.out.println("Pb select " + sqle.getMessage());
      }

    }
  
  
>>>>>>> branch 'master' of https://github.com/Made-In-Heaven-D4C-Love-Train/cpoa_td2.git
}
