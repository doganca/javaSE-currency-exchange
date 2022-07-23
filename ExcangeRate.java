package paraBozma;

public class ExcangeRate {
	
	private static double dollarToGrivnaRate;
	private static double grivnaToDollarRate;
	private static double euroToGrivnaRate;
	private static double grivnaToEuroRate;
	public static double getDollarToGrivnaRate() {
		return dollarToGrivnaRate;
	}
	public static void setDollarToGrivnaRate(double dollarToGrivnaRate) {
		ExcangeRate.dollarToGrivnaRate = dollarToGrivnaRate;
	}
	public static double getGrivnaToDollarRate() {
		return grivnaToDollarRate;
	}
	public static void setGrivnaToDollarRate(double grivnaToDollarRate) {
		ExcangeRate.grivnaToDollarRate = grivnaToDollarRate;
	}
	public static double getEuroToGrivnaRate() {
		return euroToGrivnaRate;
	}
	public static void setEuroToGrivnaRate(double euroToGrivnaRate) {
		ExcangeRate.euroToGrivnaRate = euroToGrivnaRate;
	}
	public static double getGrivnaToEuroRate() {
		return grivnaToEuroRate;
	}
	public static void setGrivnaToEuroRate(double grivnaToEuroRate) {
		ExcangeRate.grivnaToEuroRate = grivnaToEuroRate;
	}
	
}

