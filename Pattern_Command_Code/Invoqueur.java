import java.util.Map;
import java.util.HashMap;

public class Invoqueur {
	private Map<String , Commandes> commandes = new HashMap<String, Commandes>();
	
	public void ajoutercommande(String ref, Commandes cmd) {
		commandes.put(ref, cmd);
	}
	
	public void invoquer(String ref) {
		Commandes cmd = commandes.get(ref);
		if(cmd != null) cmd.executer();
	}
}
