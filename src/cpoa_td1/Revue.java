package cpoa_td1;

public class Revue {
private int id_revue, tarif_numero, id_periodicite;
private String titre, description, visuel;
private Periodicite periodicite;

public Revue(int id_revue, int tarif_numero, int id_periodicite, String titre, String description, String visuel, Periodicite periodicite) {
	this.setId_revue(id_revue);
	this.setTarif_numero(tarif_numero);
	this.setId_periodicite(id_periodicite);
	this.setTitre(titre);
	this.setDescription(description);
	this.setVisuel(visuel);
	this.setPeriodicite(periodicite);
}
public int getId_revue() {
	return this.id_revue;
}
public int getTarif_Numero() {
	return this.tarif_numero;
}
public int getId_periodicite() {
	return this.id_periodicite;
}
public String getTitre() {
	return this.titre;
}
public String getDescription() {
	return this.description;
}
public String getVisuel() {
	return this.visuel;
}
public Periodicite getPeriodicite() {
	return this.periodicite;
}
public void setId_revue(int id_revue) {
this.id_revue = id_revue;
}
public void setTarif_numero(int tarif_numero) {
this.tarif_numero = tarif_numero;
}
public void setId_periodicite(int id_periodicite) {
this.id_periodicite = id_periodicite;
}
public void setTitre(String titre) {
this.titre = titre;
}
public void setDescription(String description) {
this.description = description;
}
public void setVisuel(String visuel) {
this.visuel = visuel;
}
public void setPeriodicite(Periodicite periodicite) {
this.periodicite = periodicite;
}

}
