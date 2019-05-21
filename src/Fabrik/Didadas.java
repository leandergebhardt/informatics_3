package Fabrik;

public class Didadas extends AbstrakterErzeuger {
	private AbstraktesProdukt produkt;
	
	public Didadas() {
		
	}
	
	public AbstraktesProdukt erzeugeSchuh() {
		return this.produkt;
	}

}
