package app;

import app.Animal.Cachorro;
import app.Animal.Gato;

public class App {
	public static void main(String[] args) throws Exception {
		Cachorro Adilson = new Cachorro("Adilson", "Bulldog");
		Gato Cleber = new Gato("Cleber", "Persa");

		System.out.printf("\n");
		Adilson.mostraAnimal();
		Adilson.caminha("rua");
		Adilson.late();

		System.out.printf("\n");
		Cleber.mostraAnimal();
		Cleber.caminha();
		Cleber.mia();
	}
}