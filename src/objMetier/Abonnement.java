package objMetier;

import java.time.LocalDate;

public class Abonnement {
private int id_abonnement, id_client , id_revue;
private LocalDate date_debut, date_fin;
private Client client;
private Revue revue;


public Abonnement(int id_abonnement, int id_client, int id_revue, LocalDate date_debut, LocalDate date_fin, Client client, Revue revue) {
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
public LocalDate getDate_debut() {
	return this.date_debut;
}
public LocalDate getDate_fin() {
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

public void setDate_debut(LocalDate date_debut) {
	if (date_debut==null) {
		throw new IllegalArgumentException("La date est vide !");
		}
this.date_debut = date_debut;
}

public void setDate_fin(LocalDate date_fin) {
	if (date_fin==null) {
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

public String toString() {
return "(" + (this.id_abonnement>=0?this.id_abonnement:"nouveau") + ") " + 
this.id_client + this.id_revue + this.date_debut + this.date_fin + this.client + this.revue;
}



}
