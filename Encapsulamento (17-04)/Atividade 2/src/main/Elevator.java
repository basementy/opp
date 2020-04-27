package main;

public class Elevator {
  private int currentFloor;
  private int totalFloors;
  private int peopleAmount;
  private int capacity;

  public Elevator(int totalFloors, int capacity) {
    this.totalFloors = totalFloors;
    this.capacity = capacity;
  }

  public int getCurrentFloor() {
    return this.currentFloor;
  }

  public int getTotalFloors() {
    return this.totalFloors;
  }

  public int getPeopleAmount() {
    return this.peopleAmount;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void incrementAmount() {
    if (this.peopleAmount <= this.capacity) {
      this.peopleAmount++;
      System.out.printf("Quantidade de pessoas alterada para: %d\n", this.peopleAmount);
    }
  }

  public void decrementAmount() {
    if (this.peopleAmount > 0) {
      this.peopleAmount--;
      System.out.printf("Quantidade de pessoas alterada para: %d\n", this.peopleAmount);
    }
  }

  public void incrementFloor() {
    if (this.currentFloor < this.totalFloors) {
      this.currentFloor++;
      System.out.printf("Andar alterado para: %d\n", this.currentFloor);
    }
  }

  public void decrementFloor() {
    if (this.currentFloor > 0) {
      this.currentFloor--;
      System.out.printf("Andar alterado para: %d\n", this.currentFloor);
    }
  }
}