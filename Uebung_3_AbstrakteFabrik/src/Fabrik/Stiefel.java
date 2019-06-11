package Fabrik;

public class Stiefel extends Schuh {

	private int hoehe;
	
	/**
	 * @param hoehe
	 * @param groeße
	 * @param preis
	 * @param farbe
	 * @param marke
	 */
	public Stiefel(int hoehe, int groeße, int preis, String farbe, String marke) {
		super();
		this.hoehe = hoehe;
		this.groeße = groeße;
		this.preis = preis;
		this.farbe = farbe;
		this.marke = marke;
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
	 * @return the hoehe
	 */
	public int getHoehe() {
		return hoehe;
	}

	@Override
	public String getMarke() {
		return marke;
	}

}
