
public class CommandA implements Commandes{
	private RecepteurImpl1 recepteur;
	
	public CommandA(RecepteurImpl1 recepteur) {
		this.recepteur = recepteur; 
	}
	
	public void executer() {
		recepteur.action1();
	}
}
