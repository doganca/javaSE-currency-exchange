package paraBozma;

public class Grivna extends Money {
	
	public Grivna(double value) {
		super(value);
	}
	
	public double toDolar() {
		return ExcangeRate.getGrivnaToDollarRate() * getValue();
	}
	
	public double toEuro() {
		return ExcangeRate.getGrivnaToEuroRate() * getValue();
	}

}
