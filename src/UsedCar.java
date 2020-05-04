
public class UsedCar extends Car {
	
	protected double carMiles;
	
	public UsedCar (String carMake, String carModel, int carYear, double carPrice, double carMiles) {
		super(carMake, carModel, carYear, carPrice);
		this.carMiles = carMiles;
	}
		
	public void setMiles (double carMiles) {
		this.carMiles = carMiles;
	}
	
	public double getMiles () {
		return carMiles;
	}
		
	public String toString() {
		return carMake + "\t" + carModel + "\t" + carYear + "\t" + carPrice + "\t(Used) " + carMiles + "\n";
	}
}
