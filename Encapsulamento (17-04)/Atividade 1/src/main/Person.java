package main;

import java.time.*;

public class Person {
  private String name;
  private String birthDate;
	private double height;

	public Person(String name, String birthDate, double height) {
		this.name = name;
		this.birthDate = birthDate;
		this.height = height;
	}

	public void setPersonName(String name) {
		this.name = name;
	}

	public void setPersonBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setPersonHeight(double height) {
		this.height = height;
	}

  public String getPersonName() {
    return this.name;
  }

  public String getPersonBirthDate() {
    return this.birthDate;
  }

	public double getPersonHeight() {
		return this.height;
	}

	public void getPersonInfo() {
		System.out.printf("\nNome: %s, Nascimento: %s, Altura: %.2f\n", this.name, this.birthDate, this.height);
	}

	public void getPersonAge() {
		LocalDate birthDate = LocalDate.parse(this.birthDate);
		LocalDate currentDate = LocalDate.now();
		Period diff = Period.between(birthDate, currentDate);

		System.out.printf("%s tem %d anos.\n", this.name, diff.getYears());
	}
}