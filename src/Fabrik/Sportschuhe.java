package Fabrik;

public class Sportschuhe extends Schuh {
	
	private String sportart;

	/**
	 * @param groeße
	 * @param preis
	 * @param sportart
	 * @param marke
	 * @param farbe
	 */
	public Sportschuhe(int groeße, int preis, String sportart, String marke, String farbe) {
		super();
		
		this.groeße = groeße;
		this.preis = preis;
		this.sportart = sportart;
		this.marke = marke;
		this.farbe = farbe;
	}

	@Override
	public int getGroeße() {
		return groeße;
	}

	@Override
	public int getPreis() {
		return preis;
	}

	@Override
	public String getFarbe() {
		return farbe;
	}
	
	/**
	 * @return the sportart
	 */
	public String getSportart() {
		return sportart;
	}

	@Override
	public String getMarke() {
		return marke;
	}


}
