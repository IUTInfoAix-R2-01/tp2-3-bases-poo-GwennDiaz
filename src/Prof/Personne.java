package Prof;

public class Personne {
	
	private String Nom;
	private String Prenom;
	
	public Personne (){
		Prenom = "Laurence";
		Nom = "Ago";
	}
	
	public Personne (String Nom) {
		this.Nom = Nom;
	}
	
	public Personne (String Prenom, String Nom) {
		this.Prenom = Prenom;
		this.Nom = Nom;
	}

	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString( ) {
		return "Personne[Nom=" + Nom + ",Prenom=" + Prenom + "]";
	}
}
