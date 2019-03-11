package carParkSimulation;

public class CarParSimulationModel {

	int car_fee_per_hour = 2;
	int truck_fee_per_hour = 3;
	int parking_spaces_trucks_occupy = 2;
	int time_spent_parked_in_hours = 0;
	int no_of_spaces_available = 0;
	int available_car_spaces = 0;

	String result = "";

	public int getCar_fee_per_hour() {
		return car_fee_per_hour;
	}

	public int getTruck_fee_per_hour() {
		return truck_fee_per_hour;
	}

	public int getParking_spaces_trucks_occupy() {
		return parking_spaces_trucks_occupy;
	}

	public int getTime_spent_parked_in_hours() {
		return time_spent_parked_in_hours;
	}

	public int getNo_of_spaces_available() {
		return no_of_spaces_available;
	}

	public String getResult() {
		return result;
	}

	public int getAvailable_car_spaces() {
		return available_car_spaces;
	}
}
