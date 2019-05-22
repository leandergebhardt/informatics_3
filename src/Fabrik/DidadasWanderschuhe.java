package Fabrik;

public class DidadasWanderschuhe extends Schuh {

	private int groeße;
	private int preis;
	private String besohlung;
	private String farbe;
	private String marke;
	
	/**
	 * @param groeße
	 * @param preis
	 * @param besohlung
	 * @param farbe
	 */
	public DidadasWanderschuhe(int groeße, int preis, String besohlung, String farbe, String marke) {
		super();
		this.groeße = groeße;
		this.preis = preis;
		this.besohlung = besohlung;
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
	 * @return the besohlung
	 */
	public String getBesohlung() {
		return besohlung;
	}

	@Override
	public String getMarke() {
		return marke;
	}

}
