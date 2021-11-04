
public class CommandB implements Commandes {
	private RecepteurImpl1 recepteur;
	
	public CommandB(RecepteurImpl1 recepteur) {
		this.recepteur = recepteur; 
	}
	
	public void executer() {
		recepteur.action2();
	}
}
