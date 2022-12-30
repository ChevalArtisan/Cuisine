package stockage;

import java.util.Date;

public class Etagere {
	private int nbBoites=0;
	private Boite[] boites;
	private Ingredient ingredient;
	
	public Etagere(Ingredient ingredient,int tailleEtagere) {
		this.ingredient = ingredient;
		this.boites=new Boite[tailleEtagere];
	}

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
		//remplir la liste a la maniere d'un tri insertion selon la date de peremption
		  
		  
		  if (boite.getIngredient()==ingredient) {
			  boites[nbBoites]=boite;
			  nbBoites++;
		    
          for (int i = 1; i < nbBoites; i++)
          { 
               Boite boiteI = boites[i];  
               int j = i-1;  
            
               while(j >= 0 && boites[j].getDatePeremption().before(boiteI.getDatePeremption()))
               {
                    boites[j+1] = boites[j];  
                    j--;  
               }  
               boites[j+1] = boiteI; 
          }
          
          
     }
		 else {
			System.out.println("Vous ne pouvez pas mettre cette boite dans cette etagere");
		}
	}
	
	public void verification() {
		for (int i = 0; i < boites.length; i++) {
			
		}
	}
	public void fiche() {
		int totalIngredients = 0;

		
		for (int i = 0; i < nbBoites; i++) {
			totalIngredients+=boites[i].getNbIngredients();
			System.out.println(boites[i].getDatePeremption());
		}
		
		System.out.println("Cette etagere stocke un total de "+totalIngredients+" "+ingredient.toString()+"(s) disposes dans "+nbBoites+" boite(s)");
	}
  
     
     
     public static void main(String[] args) {
		Etagere etagere = new Etagere(Ingredient.SALADE,100);
		Boite boite1 = new Boite(1,Ingredient.SALADE,2001,1,1);
		Boite boite2 = new Boite(1,Ingredient.SALADE,2002,1,1);
		Boite boite3 = new Boite(1,Ingredient.SALADE,2003,1,1);
		Boite boiteImposteur = new Boite(1,Ingredient.STEAK,2002,1,1);
		
		etagere.remplirEtagere(boite1);
		etagere.remplirEtagere(boite3);
		etagere.remplirEtagere(boite2);
		etagere.remplirEtagere(boiteImposteur);
		
		etagere.fiche();

		

	}
		  
		    
}
