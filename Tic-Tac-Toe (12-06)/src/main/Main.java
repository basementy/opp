package main;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// Inicializa o Tabuleiro
		TicTacToe game = new TicTacToe();
		game.initializeBoard();

		do {
			int row;
			int col;

			System.out.println("Board:");
			game.printBoard();
			JOptionPane.showMessageDialog(null, "Jogador: " + Character.toUpperCase(game.getCurrentPlayerMark()));

			do {
				// Capta os Inputs
				row = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Linha: ")) - 1;
				col = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Coluna: ")) - 1;
			} while (!game.placeMark(row, col));

			game.changePlayer();
		} while (!game.checkForWin() && !game.isBoardFull());

		// Verifica Vencedor ou Velha
		if (game.isBoardFull() && !game.checkForWin()) {
			System.out.println("Draw!");
		} else {
			System.out.println("Board:");

			game.printBoard();
			game.changePlayer();

			System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " Wins!");
		}
	}
}
