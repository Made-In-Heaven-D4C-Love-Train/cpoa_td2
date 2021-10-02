package cpoa_td1;

public class Client {
private int id_client, no_rue, code_postal;
private String nom, prenom, voie, ville, pays;


public Client(int id_client, int no_rue, int code_postal, String nom, String prenom, String voie, String ville, String pays) {
	this.setId_client(id_client);
	this.setNo_rue(no_rue);
	this.setCode_postal(code_postal);
	this.setNom(nom);
	this.setPrenom(prenom);
	this.setVoie(voie);
	this.setVille(ville);
	this.setPays(pays);
}
public int getId_client() {
	return this.id_client;
}
public int getNo_rue() {
	return this.no_rue;
}
public int getCode_postal() {
	return this.code_postal;
}
public String getNom() {
	return this.nom;
}
public String getPrenom() {
	return this.prenom;
}
public String getVoie() {
	return this.voie;
}
public String getVille() {
	return this.ville;
}
public String getPays() {
	return this.pays;
}
public void setId_client(int id_client) {
this.id_client = id_client;
}
public void setNo_rue(int no_rue) {
this.no_rue = no_rue;
}
public void setCode_postal(int code_postal) {
this.code_postal = code_postal;
}
public void setNom(String nom) {
this.nom = nom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public void setVoie(String voie) {
this.voie = voie;
}
public void setVille(String ville) {
this.ville = ville;
}
public void setPays(String pays) {
this.pays = pays;
}
}
