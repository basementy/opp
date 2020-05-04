package app;

import app.Ingresso.CamaroteInferior;
import app.Ingresso.CamaroteSuperior;
import app.Ingresso.Normal;

public class App {
	public static void main(String[] args) throws Exception {
		Normal ingressoNormal = new Normal(13.50);
		CamaroteInferior camaroteInferior = new CamaroteInferior(13.50, "A25");
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior(13.50, "F16");

		System.out.printf("\n");
		ingressoNormal.imprimeTipo();
		ingressoNormal.imprimeValor();

		System.out.printf("\n");
		camaroteInferior.imprimeValor();
		camaroteInferior.imprimeLocalizacao();

		System.out.printf("\n");
		camaroteSuperior.imprimeValor();
		camaroteSuperior.imprimeLocalizacao();
	}
}