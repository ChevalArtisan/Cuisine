package stockage;

public enum Ingredient {
	PAIN("pain"), STEAK("steak"),TOMATE("tomate"),FROMAGE("fromage"),OIGNON("oignon"),SALADE("salade"),CORNICHON("cornichon");
	
	private String nom;
	
	private Ingredient(String nom) {
		this.nom=nom;
	}
	
	public String toString() {
		return nom;
	}	
}
