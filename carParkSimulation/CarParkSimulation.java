package carParkSimulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CarParkSimulation {

	private int car;
	private int truck;

	private int parking_spaces_trucks_occupy = 2;
	private int time_spent_parked_in_hours;
	private int no_of_spaces_available;
	private String result;

	public ArrayList<Integer> getVehicles() {
		return vehicles;
	}

	ArrayList<Integer> vehicles = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		CarParkSimulation cps = new CarParkSimulation();
		result = cps.user_input();
	}

	public String user_input() throws IOException {
		String result = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Car Park Simulation -- How many spaces does the car spaces have?\nUser:");

		result = br.readLine();
		while (!(result.equals("QUIT"))) {
			no_of_spaces_available = Integer.parseInt(result);
			if (result == "ENTER CAR" || result == "ENTER TRUCK") {
				vehicle_has_entered(result);
			}
			if (result == "EXIT CAR" || result == "EXIT TRUCK") {
				vehicle_has_exited(result);
				if (result == "EXIT CAR") {
					time_spent_parked_in_hours *= 2;
				} else if (result == "EXIT TRUCK") {
					time_spent_parked_in_hours *= 3;
				}
			}
		}
		return result;
	}

	public int available_parking_spaces(int spaces) {
		return spaces;
	}

	public void vehicle_has_entered(String userInput) {
		if (userInput.equals("ENTER CAR")) {
			vehicles.add(car);
		} else if (userInput.equals("ENTER TRUCK")) {
			vehicles.add(truck);
		}
	}

	public void vehicle_has_exited(String userInput) {
		if (userInput.equals("EXIT CAR")) {
			vehicles.remove(car);
		} else if (userInput.equals("EXIT TRUCK")) {
			vehicles.remove(truck);
		}
	}
}
