package app.Ingresso;

public class CamaroteSuperior extends Vip {
  private String localizacao;

  public CamaroteSuperior(double valor, String localizacao) {
    super(valor);
    this.setLocalizacao(localizacao);
  }

  public String getLocalizacao() {
    return localizacao;
  }

  @Override
  public double getValor() {
    return super.getValor() + 7.50;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public void imprimeLocalizacao() {
    System.out.printf("A localização é %s\n", this.getLocalizacao());
  }
}