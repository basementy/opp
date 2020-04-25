package main;

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
}