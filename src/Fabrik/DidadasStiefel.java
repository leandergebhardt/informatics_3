package Fabrik;

public class DidadasStiefel extends Schuh {

	private int hoehe;
	private int groeße;
	private int preis;
	private String farbe;
	private String marke;
	
	/**
	 * @param hoehe
	 * @param groeße
	 * @param preis
	 * @param farbe
	 * @param marke
	 */
	public DidadasStiefel(int hoehe, int groeße, int preis, String farbe, String marke) {
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
