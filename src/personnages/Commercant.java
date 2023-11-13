package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom,"the",quantiteArgent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu !Le monde est injuste");
		return getQuantiteArgent();
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous! je te remercie genereux donateur");
		this.gagnerArgent(argent);
	}
}
