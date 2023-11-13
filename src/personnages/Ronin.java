package personnages;

public class Ronin extends Humain {
	int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);

	}
	
	public void donner(Commercant beneficiaire) {
		double somme = 0.10 * getQuantiteArgent();
		parler(beneficiaire.getNom() + "prends ces "+(int)somme);
		beneficiaire.recevoir((int)somme);
	}
	
	public int perdre() {
		setQuantiteArgent(0);
		this.honneur--;
		parler("jai perdu");
		return honneur;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		parler("jai gagner");
	}
	public void provoquer(Yakuza adversaire ) {
		if 
	}
}
