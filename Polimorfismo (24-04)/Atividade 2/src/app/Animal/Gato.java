package app.Animal;

public class Gato extends Animal {
  public Gato(String nome, String raca) {
    super(nome, raca);
  }

  public void mia() {
    System.out.printf("Miauuu...\n");
  }

  public void caminha() {
    System.out.printf("O gato está caminhando\n");
  }
}