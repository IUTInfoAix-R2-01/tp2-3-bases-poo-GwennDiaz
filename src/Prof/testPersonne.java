package Prof;

public class testPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne ("lolo");
		System.out.println ("le nom est " + p1.getNom() + " et le prenom est " + p1.getPrenom());
		
		Personne p2 = new Personne ("lolo","ago");
		System.out.println(p2);
	}

}
