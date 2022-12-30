package cuisine;

public class Recette {
    private String name;
    private int amtTomate;
    private int amtPain;
    private int amtSteak;
    private int amtFromage;

    private int amtCornichon;
    private int amtSalade;
    private int amtOignons;
    
	public Recette(String name, int amtTomate, int amtPain, int amtSteak, int amtFromage,int amtCornichon, int amtSalade, int amtOignons) {
		super();
		this.name = name;
		this.amtTomate = amtTomate;
		this.amtPain = amtPain;
		this.amtSteak = amtSteak;
		this.amtFromage = amtFromage;
		this.amtCornichon = amtCornichon;
		this.amtSalade = amtSalade;
		this.amtOignons = amtOignons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmtTomate() {
		return amtTomate;
	}

	public void setAmtTomate(int amtTomate) {
		this.amtTomate = amtTomate;
	}

	public int getAmtPain() {
		return amtPain;
	}

	public void setAmtPain(int amtPain) {
		this.amtPain = amtPain;
	}

	public int getAmtSteak() {
		return amtSteak;
	}

	public void setAmtSteak(int amtSteak) {
		this.amtSteak = amtSteak;
	}

	public int getAmtFromage() {
		return amtFromage;
	}

	public void setAmtFromage(int amtFromage) {
		this.amtFromage = amtFromage;
	}

	public int getAmtCornichon() {
		return amtCornichon;
	}

	public void setAmtCornichon(int amtCornichon) {
		this.amtCornichon = amtCornichon;
	}

	public int getAmtSalade() {
		return amtSalade;
	}

	public void setAmtSalade(int amtSalade) {
		this.amtSalade = amtSalade;
	}

	public int getAmtOignons() {
		return amtOignons;
	}

	public void setAmtOignons(int amtOignons) {
		this.amtOignons = amtOignons;
	}
    
    

    }
	

