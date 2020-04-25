public class PessoaFisica extends Client {
  String cpf;

  public PessoaFisica(
    String clientName,
    String clientAddress,
    String clientPhone,
    String clientCpf
  ) {
    super(clientName, clientAddress, clientPhone);
    this.cpf = clientCpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void printInfo() {
    System.out.println("O cliente " + this.name + ", portador do CPF " + this.cpf + ", mora em " + this.address + " e seu número do celular é " + this.phone);
  }
}