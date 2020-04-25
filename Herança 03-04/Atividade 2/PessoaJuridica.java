public class PessoaJuridica extends Client {
  String cnpj;
  String nomeFantasia;

  public PessoaJuridica(
    String clientName,
    String clientAddress,
    String clientPhone,
    String clientCnpj,
    String clientNomeFantasia
  ) {
    super(clientName, clientAddress, clientPhone);
    this.cnpj = clientCnpj;
    this.nomeFantasia = clientNomeFantasia;
  }

  public void setNomeFantasia(String clientNomeFantasia) {
    this.nomeFantasia = clientNomeFantasia;
  }


  public String getCnpj() {
    return this.cnpj;
  }

  public String getNomeFantasia() {
    return this.nomeFantasia;
  }

  public void printInfo() {
    System.out.println("A empresa " + this.nomeFantasia + ", portadora do CNPJ " + this.cnpj + ", possui sede em " + this.address + " e seu número para contato é " + this.phone);
  }
}