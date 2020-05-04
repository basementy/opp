package app.Ingresso;

public class Vip extends Ingresso {
  public Vip(double valor) {
    super(valor);
  }

  @Override
  public double getValor() {
    return super.getValor() + 5.50;
  }
}