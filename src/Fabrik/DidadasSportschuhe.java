package Fabrik;

public class DidadasSportschuhe extends Schuh {
	
	private int groeße;
	private int preis;
	private String sportart;
	private String marke;
	private String farbe;

	/**
	 * @param groeße
	 * @param preis
	 * @param sportart
	 * @param marke
	 * @param farbe
	 */
	public DidadasSportschuhe(int groeße, int preis, String sportart, String marke, String farbe) {
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
