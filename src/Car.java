
public class Car {
	
	protected String carMake;
	protected String carModel;
	protected int carYear;
	protected double carPrice;
	
	public Car () {
		
	}
	
	public Car (String carMake, String carModel, int carYear, double carPrice) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carYear = carYear;
	}
	
	public void setMake (String carMake) {
		this.carMake = carMake;
	}
	
	public void setModel (String carModel) {
		this.carModel = carModel;
	}
	
	public void setYear (int carYear) {
		this.carYear = carYear;
	}
	
	public void setPrice (double carPrice) {
		this.carPrice = carPrice;
	}
	
	public String getMake () {
		return carMake;
	}
	
	public String getModel () {
		return carModel;
	}
	
	public int getYear () {
		return carYear;
	}
	
	public double getPrice () {
		return carPrice;
	}
	
	@Override
	public String toString() {
		return carMake + "\t" + carModel + "\t" + carYear + "\t" + carPrice + "\n";
	}
	
	

}
