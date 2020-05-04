import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab12Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<>();
		LinkedList<Car> fullCarList = new LinkedList<>();
		String yesNo = "";
		Car car1 = new UsedCar("Honda", "Civic", 1999, 5000.00, 50000.00);
		Car car2 = new UsedCar("Lincoln", "Mercury", 1990, 3000.00, 100000.00);
		Car car3 = new UsedCar("Chevy", "Impala", 2004, 6000.00, 125000.00);
		System.out.println("Welcome to Trig's Tiny Car List!");
		System.out.println("How many cars are you entering?");
		int numOfCars = scnr.nextInt();
		for (int i = 0; i < numOfCars; i++) {
			if  (i < numOfCars) {
			System.out.println("Enter car make: ");
			String newMake = scnr.next().toLowerCase();
			System.out.println("Enter car model: ");
			String newModel = scnr.next().toLowerCase();
			System.out.println("Enter car year: ");
			int newYear = scnr.nextInt();
			System.out.println("Enter car price: ");
			double newPrice = scnr.nextDouble();
			Car newCar = new Car(newMake, newModel, newYear, newPrice);
			carList.add(newCar);
			System.out.println("Processing...");
			System.out.println("");
		}else {
			break;
		}
		}
		fullCarList.addAll(carList);
		fullCarList.add(car1);
		fullCarList.add(car2);
		fullCarList.add(car3);
		System.out.println("Current Inventory:");
		System.out.println(fullCarList.toString());
		System.out.println("");
		System.out.println("Please select a model to purchase:");
		String userSelection = scnr.next().toLowerCase();
		if (userSelection.equals("null")) {
			System.out.println("Please enter a model from the list.");
			userSelection = scnr.next().toLowerCase();
		}else {
			System.out.println("Would you like to buy this car? yes/no");
			yesNo = scnr.next().toLowerCase();
		}if (yesNo.equals("yes")) {
			System.out.println("Excellent! Our finance team will be in touch shortly!");
			System.out.println("Have a wonderful day! Goodbye!");
		}else if (yesNo.equals("no")) {
			System.out.println("We're sorry to hear that, have a great day! Goodbye!");
		}else {
			System.out.println("Please enter yes or no.");
			yesNo = scnr.next().toLowerCase();
		}
	}
}	
