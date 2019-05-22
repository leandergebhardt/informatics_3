package Fabrik;

public class Didadas extends SchuhHersteller {

	public final static int SPORTSCHUHE = 1;
	public final static int STIEFEL = 2;
	public final static int WANDERSCHUHE = 3;

	@Override
	public Schuh erzeugeSchuhe(int Type) {
		switch (Type) {
		case SPORTSCHUHE:
			return new Sportschuhe(39, 80, "Tennis", "Didadas", "Schwarz");
		case STIEFEL:
			return new Stiefel(36, 40, 120, "Rot", "Didadas");
		case WANDERSCHUHE:
			return new Wanderschuhe(42, 230, "Alpin", "Blau", "Didadas");
		default:
			return null;
		}
	}

}
