package paraBozma;

public  class Euro extends Exchenge {

	public Euro(Double value) {
		super(value);
	}

	public double toGrivna() {
		return ExcangeRate.getEuroToGrivnaRate() * getValue();
	}
	

}
