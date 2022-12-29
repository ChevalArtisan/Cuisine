package stockage;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Boite {

	private int nbIngredients;
	private Ingredient ingredient;
	private Date datePeremption;//format YYYYMMDD

	
	
	public Boite(int nbIngredients, Ingredient ingredient, int annee,int mois, int jour) {
		this.nbIngredients = nbIngredients;
		this.ingredient = ingredient;
		this.datePeremption = new Date(annee-1900,mois-1,jour);
	}
	
	public void fiche() {
		System.out.println("Boite de "+nbIngredients+" "+ingredient.toString()+"(s)");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Elle perime le "+format.format(datePeremption));
	}

	public int getNbIngredients() {
		return nbIngredients;
	}

	public void setNbIngredients(int nbIngredients) {
		this.nbIngredients = nbIngredients;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Date getDatePeremption() {
		return datePeremption;
	}

	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}
	
	public boolean estPerimee() {
		DateFormat format = new SimpleDateFormat("yyyyddMM");
		Date date = new Date();
		System.out.println(date);
		System.out.println(format.format(date));
		return datePeremption.before(date);
	}
	
	
	public static void main(String[] args) {
		Boite boitetomate = new Boite(10,Ingredient.TOMATE,2022,12,30);
		boitetomate.fiche();
		System.out.println(boitetomate.estPerimee());
		System.out.println(boitetomate.getDatePeremption());
	}


	
}
