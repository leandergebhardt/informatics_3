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
		
		// console output to check whats going on
		System.out.println(" Schuhgröße: " + meinSchuh.getGroeße() 
										   + ", Preis: " + meinSchuh.getPreis() 
										   + "€, Farbe: " + meinSchuh.getFarbe() 
										   + ", Marke: " + meinSchuh.getMarke() 
										   + ", ClassType: " + meinSchuh.getClass());

	}

}
