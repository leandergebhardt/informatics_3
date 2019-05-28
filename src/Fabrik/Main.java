package Fabrik;

public class Main {


	public static void main(String[] args) {
		
		/*
		 * Indicies to pass into erzeugeSchuhe
		 * 
		 * 1 - Sportschuhe
		 * 2 - Stiefel
		 * 3 - Wanderschuhe
		 */
		
		SchuhHersteller hersteller = new Enki();
		Schuh meinSchuh = hersteller.erzeugeSchuhe(1);

		SchuhHersteller hersteller2 = new Didadas();
		Schuh zweitSchuh = hersteller2.erzeugeSchuhe(2);
		
		SchuhHersteller hersteller3 = new Enki();
		Schuh drittSchuh = hersteller3.erzeugeSchuhe(3);
		
		// console output to check whats going on
		System.out.println(printShoe(meinSchuh));
		System.out.println(printShoe(zweitSchuh));
		System.out.println(printShoe(drittSchuh));

	}

	private static String printShoe(Schuh schoe){
		return  ("- Schuhgröße: " + schoe.getGroeße()
				+ ", Preis: " + schoe.getPreis()
				+ "€, Farbe: " + schoe.getFarbe()
				+ ", Marke: " + schoe.getMarke()
				+ ", ClassType: " + schoe.getClass())
				+ "\n";
	}

}
