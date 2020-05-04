package app.Animal;

public class Cachorro extends Animal {
  public Cachorro(String nome, String raca) {
    super(nome, raca);
  }

  public void late() {
    System.out.printf("Au, au, au...\n");
  }

  public void caminha(String lugar) {
    System.out.printf("O cachorro caminha na %s\n", lugar);
  }
}