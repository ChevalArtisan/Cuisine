package stockage;

public class Etagere {
	private int nbBoites;
	private Boite[] boites;
	private Ingredient ingredient;
	public int getNbBoites() {
		return nbBoites;
	}
	public void setNbBoites(int nbBoites) {
		this.nbBoites = nbBoites;
	}
	
	public Boite[] getBoites() {
		return boites;
	}
	
	public void setBoites(Boite[] boites) {
		this.boites = boites;
	}
	
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	public void remplirEtagere(Boite boite) {
		//TODO remplir la liste a la maniere d'un tri insertion selon la date de peremption
	}
}
