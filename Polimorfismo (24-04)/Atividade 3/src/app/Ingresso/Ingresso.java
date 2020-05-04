package app.Ingresso;

public class Ingresso {
  private double valor;

  public Ingresso(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void imprimeValor() {
    System.out.printf("O valor do ingresso é: R$%.2f\n", this.getValor());
  }
}