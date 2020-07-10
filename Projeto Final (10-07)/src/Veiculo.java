public class Veiculo {
  private String cor;
  private String ano;
  private String modelo;
  private ViagemCarro viagem;
  private Proprietario proprietario;
  private boolean abastecido = false;
  private double tanqueGasolina = 0;
  private int velocidadeAtual = 0;

  public Veiculo(String cor, String ano, String modelo, double tanqueGasolina, Proprietario proprietario) {
    this.cor = cor;
    this.ano = ano;
    this.modelo = modelo;
    this.tanqueGasolina = tanqueGasolina;
    this.proprietario = proprietario;
  }

  // Setters & Getters
  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(int velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public double getTanqueGasolina() {
    return tanqueGasolina;
  }

  public void setTanqueGasolina(double tanqueGasolina) {
    this.tanqueGasolina = tanqueGasolina;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getAno() {
    return ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }

  public ViagemCarro getViagem() {
    return viagem;
  }

  public void setViagem(ViagemCarro viagem) {
    this.viagem = viagem;
  }

  public Proprietario getProprietario() {
    return proprietario;
  }

  public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
  }

  public boolean isAbastecido() {
    return abastecido;
  }

  public void setAbastecido(boolean abastecido) {
    this.abastecido = abastecido;
  }

  // Others
  public void initializeViagem(String destino, String origem, int distanciaTotal) {
    this.setViagem(new ViagemCarro(destino, origem, distanciaTotal));
  }

  public void updateGastoTotal() {
    double gasto = this.getViagem().getGastoCombustivel();
    double tanque = Math.round(this.getTanqueGasolina() * 100) / 100;

    if (tanque == 5) {
      this.setTanqueGasolina(45.0);
      this.setAbastecido(true);
    }

    if (this.getVelocidadeAtual() <= 80) {
      this.setTanqueGasolina(this.getTanqueGasolina() - 0.2);
      this.getViagem().setGastoCombustivel(gasto + 0.2);
    } else if (this.getVelocidadeAtual() > 80 && this.getVelocidadeAtual() <= 120) {
      this.setTanqueGasolina(this.getTanqueGasolina() - 0.1);
      this.getViagem().setGastoCombustivel(gasto + 0.1);
    } else {
      this.setTanqueGasolina(this.getTanqueGasolina() - 0.4);
      this.getViagem().setGastoCombustivel(gasto + 0.4);
    }
  }

  public void printDados() {
    String origemViagem = this.getViagem().getOrigem();
    String destinoViagem = this.getViagem().getDestino();
    String nomeProprietario = this.getProprietario().getNome();
    String isAbastecido = this.isAbastecido() ? "Sim" : "Não";
    String totalTanque =  Math.round(this.getTanqueGasolina() * 100) / 100 + " KM";
    String totalKms = this.getViagem().getDistanciaTotal() + " KMs";
    String totalGasto = "R$" + Math.round(this.getViagem().getGastoCombustivel() * 100) / 100;

    System.out.println("\nOrigem Viagem: " + origemViagem);
    System.out.println("Destino Viagem: " + destinoViagem);
    System.out.println("Proprietário: "+ nomeProprietario);
    System.out.println("Tanque: " + totalTanque);
    System.out.println("Abastecido: " + isAbastecido);
    System.out.println("Total KMs: " + totalKms);
    System.out.println("Total Gasto: " + totalGasto);
    System.out.println("--------------------");
  }
}