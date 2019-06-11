package Fabrik;

public class Umap extends SchuhHersteller {

	public final static int SPORTSCHUHE = 1;
	public final static int STIEFEL = 2;
	public final static int WANDERSCHUHE = 3;

	@Override
	public Schuh erzeugeSchuhe(int Type) {
		switch (Type) {
		case SPORTSCHUHE:
			return new Sportschuhe(38, 95, "Tanz", "Umap", "Blau");
		case STIEFEL:
			return new Stiefel(46, 39, 230, "Beige", "Umap");
		case WANDERSCHUHE:
			return new Wanderschuhe(42, 320, "Hochalpin", "Türkis", "Umap");
		default:
			return null;
		}
	}

}
