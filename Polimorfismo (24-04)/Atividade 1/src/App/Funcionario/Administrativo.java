package App.Funcionario;

public class Administrativo extends Assistente {
	public Administrativo(String nome, String empresa, Number matricula, double salario) {
		super(nome, empresa, matricula, salario);
	}

	@Override
	public double getSalario() {
		return super.getSalario() + 250.00;
	}
}