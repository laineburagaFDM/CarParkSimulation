package carParkSimulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalanceReport {

	int no_of_cars_entered;
	int no_of_cars_exited;
	int no_of_trucks_entered;
	int no_of_trucks_exited;
	int no_of_vehicles_entered = no_of_cars_entered + no_of_trucks_exited;
	int no_of_vehicles_exited;
	int no_of_spaces_available;
	int amount_paid_so_far;
	int cars_parked;
	int trucks_parked;

	public void report(String input) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Car Park Simulation -- How many spaces does the car spaces have?\nUser:");

		String spaces_available = br.readLine();
		System.out.println("User: " + spaces_available + no_of_spaces_available);
		String enter_vehicle = br.readLine();
		System.out.println("User: " + enter_vehicle);

		System.out.println("Balance Report:");
		System.out.println("\nCars Entered: " + no_of_vehicles_entered);
		System.out.println("\nTrucks Entered: " + no_of_trucks_entered);
		System.out.println("\nCars Exited: " + no_of_cars_exited);
		System.out.println("\nTrucks Exited: " + no_of_trucks_exited);
		System.out.println("\nParking Cars: " + cars_parked);
		System.out.println("\nParking Trucks: " + trucks_parked);
		System.out.println("\nSpaces available: " + no_of_spaces_available);
		System.out.println("\nFees paid: $" + amount_paid_so_far);
	}

}
