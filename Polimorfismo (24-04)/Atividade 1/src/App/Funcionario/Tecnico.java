package App.Funcionario;

public class Tecnico extends Assistente {
	private String turno;

	public Tecnico(String nome, String empresa, Number matricula, double salario,  String turno) {
		super(nome, empresa, matricula, salario);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public double getSalario() {
		if (this.turno == "noturno")
			return super.getSalario() + 300.00;
		else
			return super.getSalario();
	}
}