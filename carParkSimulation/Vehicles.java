package carParkSimulation;

public class Vehicles {

	int no_of_cars_that_entered;
	int no_of_trucks_that_truck;

	int car_fee_per_hour = 2;
	int truck_fee_per_hour = 3;
	int time_spent_parked;

	public long calculate_time_spent_parked(long hours) {
		if (time_spent_parked < 1) {
			car_fee_per_hour = 0;
		} else if (time_spent_parked >= 1) {
			car_fee_per_hour = time_spent_parked * car_fee_per_hour;
		}
		return hours;
	}
}
