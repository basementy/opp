package main;

public class App {
	public static void main(String[] args) throws Exception {
		Control firstControl = new Control();

		firstControl.getCurrentChannel(); // Init State
		firstControl.getCurrentVolume(); // Init State

		firstControl.incrementVolume(); // Change Volume State
		firstControl.changeChannel(53); // Change Channel State

		firstControl.getCurrentChannel(); // Get Mutate State
		firstControl.getCurrentVolume(); // Get Mutate State
	}
}