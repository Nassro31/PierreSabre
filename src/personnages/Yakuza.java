package personnages;

public class Yakuza extends Humain {
	String clan;
	
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent ,String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;
	}
	
}
