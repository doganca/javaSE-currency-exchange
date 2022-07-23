package paraBozma;

public abstract class Exchenge extends Money{

	public Exchenge(double value) {
		super(value);
	}
	
	public abstract double toGrivna();

}
