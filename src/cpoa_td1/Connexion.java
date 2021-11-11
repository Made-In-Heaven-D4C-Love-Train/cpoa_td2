package cpoa_td1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Connexion{
	
	private static Connexion instance;
	private Connexion() {}
	public static Connexion getInstance() {
	if (instance==null) {
	instance = new Connexion();
	}
	return instance;
	}
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
	Properties accesBdd = new Properties(); 
	File fBdd = new File("Property.properties");
	try { 
	FileInputStream source = new FileInputStream(fBdd); 
	accesBdd.loadFromXML(source); 
	} catch (IOException ioe) { 
	ioe.printStackTrace(); 
	} 
	System.out.println(accesBdd.getProperty("login"));

	
}}
