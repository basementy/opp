package main;

public class App {
	public static void main(String[] args) throws Exception {
		Person firstPerson = new Person("Gabriel", "1999-08-23", 1.75);

		firstPerson.setPersonName("Carlos");
		firstPerson.getPersonInfo();
		firstPerson.getPersonAge();
	}
}