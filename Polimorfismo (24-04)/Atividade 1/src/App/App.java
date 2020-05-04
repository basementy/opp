package App;

import App.Funcionario.Gerente;
import App.Funcionario.Administrativo;
import App.Funcionario.Tecnico;

public class App {
	public static void main(String[] args) throws Exception {
		Gerente Paulo = new Gerente("Paulo", "Totvs", 2500.00);
		Tecnico Alexandre = new Tecnico("Alexandre", "Tupy", 222334, 2000.00, "Noturno");
		Administrativo Fernando = new Administrativo("Fernando", "Whirpool", 122334, 1500.00);

		Paulo.exibeDados();
		Fernando.exibeDados();
		Alexandre.exibeDados();
	}
}