public class App {
	public static void main(String[] args) throws Exception {
		Proprietario proprietarioJoão = new Proprietario(20, "João");
		Proprietario proprietarioPedro = new Proprietario(40, "Pedro");
		Veiculo veiculoJoão = new Veiculo("Branco", "2002", "GOL", 45, proprietarioJoão);
		VeiculoEsportivo veiculoPedro = new VeiculoEsportivo("Vermelho", "2018", "GOLF", 35, proprietarioPedro);

		veiculoJoão.initializeViagem("Florianopolis", "Joinville", 250);
		veiculoPedro.initializeViagem("Florianopolis", "Joinville", 250);

		while (veiculoJoão.getViagem().getDistanciaPercorrida() < veiculoJoão.getViagem().getDistanciaTotal()) {
			int distanciaPercorria = veiculoJoão.getViagem().getDistanciaPercorrida();

			if (distanciaPercorria <= 50) {
				veiculoJoão.setVelocidadeAtual(80);
			} else if (distanciaPercorria > 80 && distanciaPercorria <= 150) {
				veiculoJoão.setVelocidadeAtual(130);
			} else {
				veiculoJoão.setVelocidadeAtual(100);
			}

			veiculoJoão.updateGastoTotal();
			veiculoJoão.getViagem().setDistanciaPercorrida(distanciaPercorria + 1);
		}

		while (veiculoPedro.getViagem().getDistanciaPercorrida() < veiculoPedro.getViagem().getDistanciaTotal()) {
			int distanciaPercorria = veiculoPedro.getViagem().getDistanciaPercorrida();

			if (distanciaPercorria <= 50) {
				veiculoPedro.setVelocidadeAtual(80);
			} else if (distanciaPercorria > 80 && distanciaPercorria <= 150) {
				veiculoPedro.setVelocidadeAtual(150);
			} else {
				veiculoPedro.setVelocidadeAtual(110);
			}

			if (distanciaPercorria >= 100) {
				veiculoPedro.setTurbo(true);
			}

			veiculoPedro.updateGastoTotal();
			veiculoPedro.getViagem().setDistanciaPercorrida(distanciaPercorria + 1);
		}

		veiculoJoão.printDados();
		veiculoPedro.printDados();
	}
}
