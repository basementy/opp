package app.Ingresso;

public class CamaroteInferior extends Vip {
  private String localizacao;

  public CamaroteInferior(double valor, String localizacao) {
    super(valor);
    this.setLocalizacao(localizacao);
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public void imprimeLocalizacao() {
    System.out.printf("O ingresso está localizado em %s\n", this.getLocalizacao());
  }
}