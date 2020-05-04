package App.Funcionario;

public class Funcionario {
  private String nome;
  private String empresa;
  private double salario;

  public Funcionario(String nome, String empresa, double salario) {
    this.nome = nome;
    this.empresa = empresa;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public String getEmpresa() {
    return empresa;
  }

  public double getSalario() {
    return salario;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void exibeDados() {
    System.out.printf("Nome: %s, Empresa: %s, Salario: %.2f\n",
      this.getNome(),
      this.getEmpresa(),
      this.getSalario());
  }
}