package app.Ingresso;

public class Normal extends Ingresso {
  public Normal(double valor) {
    super(valor);
  }

  public void imprimeTipo() {
    System.out.printf("Ingresso normal\n");
  }
}