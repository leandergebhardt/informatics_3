package Fabrik;

public class Main {

	private static SchuhHersteller enki = new Enki();
	private static SchuhHersteller didadas = new Didadas();
	private static SchuhHersteller umap = new Umap();
	
	/*
	 * Indicies to pass into erzeugeSchuhe
	 * 
	 * 1 - Sportschuhe
	 * 2 - Stiefel
	 * 3 - Wanderschuhe
	 */
	
	public final static Schuh[] EnkiFactory() {
		Schuh[] enkiSchuhe = new Schuh[3];
		
		for (int i = 0; i < enkiSchuhe.length; i++) {
			enkiSchuhe[i] =  enki.erzeugeSchuhe(i + 1);
		}
		
		return enkiSchuhe;
	}
	
	public final static Schuh[] didadasFactory() {
		Schuh[] didadasSchuhe = new Schuh[3];
		
		for (int i = 0; i < didadasSchuhe.length; i++) {
			didadasSchuhe[i] =  didadas.erzeugeSchuhe(i + 1);
		}
		
		return didadasSchuhe;
	}
	
	public final static Schuh[] umapFactory() {
		Schuh[] umapSchuhe = new Schuh[3];
		
		for (int i = 0; i < umapSchuhe.length; i++) {
			umapSchuhe[i] =  umap.erzeugeSchuhe(i + 1);
		}
		
		return umapSchuhe;
	}
	
	public static void main(String[] args) {
				
		// console output to check whats going on
		System.out.println(printShoe(EnkiFactory()));
		System.out.println(printShoe(didadasFactory()));
		System.out.println(printShoe(umapFactory()));

	}

	private static String printShoe(Schuh[] schoe){
		
		String result = " " + schoe[0].getMarke() + "\n";
		
		for (int i = 0; i < schoe.length; i++) {
			result += "- Schuhgröße: " + schoe[i].getGroeße()
			+ ", Preis: " + schoe[i].getPreis()
			+ "€, Farbe: " + schoe[i].getFarbe()
			+ ", Marke: " + schoe[i].getMarke()
			+ ", ClassType: " + schoe[i].getClass()
			+ "\n";
		}
		
		return result;
	}

}
