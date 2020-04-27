package main;

public class App {
	public static void main(String[] args) throws Exception {
		Elevator firstElevator = new Elevator(10, 12);

		firstElevator.incrementAmount();
		firstElevator.incrementFloor();
	}
}