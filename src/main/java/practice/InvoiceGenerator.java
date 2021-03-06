package practice;

public class InvoiceGenerator {
	private static final double MINIMUM_COST_PER_KM = 10;
	private static final int COST_PER_MINUTE = 1;
	private static final double MINIMUM_FARE = 5;

	private static final double MINIMUM_COST_PER_KM_PREMIUM = 15;
	private static final int COST_PER_MINUTE_PREMIUM= 2;
	private static final double MINIMUM_FARE_PREMIUM = 20;
	public double calculate(double distance, int time) {

		double fare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;
		if (fare < 5) {
			return MINIMUM_FARE;
		} else
			return fare;
	}

	public double calculate(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculate(ride.distance, ride.time);
		}
		return totalFare;

	}

	public int count(Ride[] rides) {
		int count = 0;
		for (Ride ride : rides) {
			count += 1;
		}
		return count;
	}
	public double Average(double totalFare, int count) {
		return totalFare / count;
	}
	public double premium(double distance, int time) {
		double fare = distance * MINIMUM_COST_PER_KM_PREMIUM + time * COST_PER_MINUTE_PREMIUM;
		if (fare < 20) {
			return MINIMUM_FARE_PREMIUM;
		} else
			return fare;
	}
}
