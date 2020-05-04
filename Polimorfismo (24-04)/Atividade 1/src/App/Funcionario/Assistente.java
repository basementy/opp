package App.Funcionario;

public class Assistente extends Funcionario {
  private Number matricula;

  public Assistente(String nome, String empresa, Number matricula, double salario) {
    super(nome, empresa, salario);
    this.matricula = matricula;
	}

  public Number getMatricula() {
    return matricula;
  }

  public void setMatricula(Number matricula) {
    this.matricula = matricula;
  }

  public void exibeDados() {
    System.out.printf("Nome: %s, Empresa: %s, Matricula: %s, Salario: %.2f\n",
      this.getNome(),
      this.getEmpresa(),
      this.getMatricula(),
      this.getSalario());
  }
}