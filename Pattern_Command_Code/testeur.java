
public class testeur {

	public static void main(String[] args) {
		RecepteurImpl1 rec1 = new RecepteurImpl1();
		RecepteurImpl2 rec2 = new RecepteurImpl2();
		
		Commandes cmd1 = new CommandA(rec1);
		Commandes cmd2 = new CommandB(rec1);
		Commandes cmd3 = new CommandC(rec2);
		
		Invoqueur telecommande = new Invoqueur(); 
		
		telecommande.ajoutercommande("A", cmd1);
		telecommande.ajoutercommande("B", cmd2);
		telecommande.ajoutercommande("C", cmd3);
		
		telecommande.invoquer("A");
		telecommande.invoquer("B");
		telecommande.invoquer("C");
	}

}


