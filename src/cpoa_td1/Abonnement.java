package cpoa_td1;

public class Abonnement {
private int id_abonnement, id_client , id_revue;
private String date_debut, date_fin;
private Client client;
private Revue revue;


public Abonnement(int id_abonnement, int id_client, int id_revue, String date_debut, String date_fin, Client client, Revue revue) {
	this.setId_abonnement(id_abonnement);
	this.setId_client(id_client);
	this.setId_revue(id_revue);
	this.setDate_debut(date_debut);
	this.setDate_fin(date_fin);
	this.setClient(client);
	this.setRevue(revue);
	
}

public int getId_abonnement() 
{ 
return this.id_abonnement; 
}
public int getId_client() {
	return this.id_client;
}
public int getId_revue() {
	return this.id_revue;
}
public String getDate_debut() {
	return this.date_debut;
}
public String getDate_fin() {
	return this.date_fin;
}
public Client getClient() {
	return this.client;
}
public Revue getRevue() {
	return this.revue;
}
public void setId_abonnement(int id_abonnement) {
this.id_abonnement = id_abonnement;
}

public void setId_client(int id_client) {
this.id_client = id_client;
}

public void setId_revue(int id_revue) {
this.id_revue = id_revue;
}

public void setDate_debut(String date_debut) {
	if (date_debut==null || date_debut.trim().length()==0) {
		throw new IllegalArgumentException("La date est vide !");
		}
this.date_debut = date_debut;
}

public void setDate_fin(String date_fin) {
	if (date_fin==null || date_fin.trim().length()==0) {
		throw new IllegalArgumentException("La date est vide !");
		}
this.date_fin = date_fin;
}

public void setClient(Client client) {
this.client = client;
}

public void setRevue(Revue revue) {
this.revue = revue;
}

}
