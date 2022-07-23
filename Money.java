package paraBozma;

public abstract class Money {

	private double value;

	public Money(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}	
}
