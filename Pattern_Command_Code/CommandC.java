
public class CommandC implements Commandes {
private RecepteurImpl2 recepteur;
	
	public CommandC(RecepteurImpl2 recepteur) {
		this.recepteur = recepteur; 
	}
	
	public void executer() {
		recepteur.action3();
	}
}
