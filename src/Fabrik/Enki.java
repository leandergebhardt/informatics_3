package Fabrik;

public class Enki extends SchuhHersteller {

	public final static int SPORTSCHUHE = 1;
	public final static int STIEFEL = 2;
	public final static int WANDERSCHUHE = 3;

	@Override
	public Schuh erzeugeSchuhe(int Type) {
		switch (Type) {
		case SPORTSCHUHE:
			return new Sportschuhe(45, 320, "Basketball", "Enki", "Grau");
		case STIEFEL:
			return new Stiefel(39, 42, 200, "Braun", "Enki");
		case WANDERSCHUHE:
			return new Wanderschuhe(43, 320, "Mittelalpin", "Gelb", "Enki");
		default:
			return null;
		}
	}

}
