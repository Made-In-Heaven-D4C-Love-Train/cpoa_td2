package objMetier;

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
public Revue(String string, String string2, int i, String string3, Periodicite dut2a) {
	// TODO Auto-generated constructor stub
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
	if (titre==null || titre.trim().length()==0) {
		throw new IllegalArgumentException("Le titre est vide !");
		}
this.titre = titre;
}
public void setDescription(String description) {
	if (description==null || description.trim().length()==0) {
		throw new IllegalArgumentException("La description est vide !");
		}
this.description = description;
}
public void setVisuel(String visuel) {
	if (visuel==null || visuel.trim().length()==0) {
		throw new IllegalArgumentException("Le visuel est vide !");
		}
this.visuel = visuel;
}
public void setPeriodicite(Periodicite periodicite) {
this.periodicite = periodicite;
}
public String toString() {
return "(" + (this.id_revue>=0?this.id_revue:"nouveau") + ") " + 
this.id_revue + this.tarif_numero + this.id_periodicite + this.titre + this.description + this.visuel + this.periodicite;
}

}
