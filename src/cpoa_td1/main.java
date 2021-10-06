package cpoa_td1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	 td1 td = new td1();
	 td.creeConnexion();
     td.InsererPeriodicite(13, "'salut'");
     td.SupprimerPeriodicite(13);
     td.ModifierPeriodicite(75,50,"'yo'",16);
     td.InsererRevue(12345, "'aled'", "'aled'", 63, "'aled'", 200);
     td.SupprimerRevue(0);
     td.ModifierRevue(10, 12345, 5, 200);
     td.InsererClient(5, "'Lassalle'", "'Jean'", 5, "'jsp'", 54000, "'France'", "'Terre'");
     td.SupprimerClient(4);
     td.ModifierClient(4, 2, 55000, 57000);
     td.InsererAbonnement(10, "09/06/2020", "10/06/2020", 10, 20);
     td.SupprimerAbonnement(9);
     td.ModifierAbonnement(2, 1);
	//value = nouvelle valeur de l'id, value1 = id existant qu'on veut modifier et value2 = id existant du libelle qu'on veut modifier
     
	}
	
}
