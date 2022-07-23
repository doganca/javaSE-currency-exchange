package paraBozma;

public class Dollar extends Exchenge {

	public Dollar(double value) {
		super(value);
	}

	public double toGrivna() {
		return ExcangeRate.getDollarToGrivnaRate() * getValue();
	}

}
