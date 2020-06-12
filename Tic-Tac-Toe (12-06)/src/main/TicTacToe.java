package main;

import javax.swing.JOptionPane;

public class TicTacToe {
	private char[][] board;
	private char currentPlayerMark;

	public TicTacToe() {
		board = new char[3][3];
		currentPlayerMark = 'x';
		initializeBoard();
	}

	// Retorna a marca do jogador atual
	public char getCurrentPlayerMark() {
		return currentPlayerMark;
	}

	// Inicializa o tabuleiro
	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	// Mostra todo o tabuleiro
	public void printBoard() {
		System.out.println("-------------");

		for (int i = 0; i < 3; i++) {
			System.out.print("| ");

			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}

			System.out.println();
			System.out.println("-------------");
		}
	}

	// Verifica se o tabuleiro está cheio
	public boolean isBoardFull() {
		boolean isFull = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}

		return isFull;
	}

	// Verifica todas as linhas, colunas e diagonais
	public boolean checkForWin() {
		return (checkRows() || checkColumns() || checkDiagonal());
	}

	// Verifica as linhas
	private boolean checkRows() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}

		return false;
	}

	// Verifica as colunas
	private boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}

		return false;
	}

	// Verifica as diagonais
	private boolean checkDiagonal() {
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	}

	private boolean checkRowCol(char c1, char c2, char c3) {
		return (
			(c1 != '-') &&
			(c1 == c2) &&
			(c2 == c3)
		);
	}

	// Altera o jogador atual
	public void changePlayer() {
		if (currentPlayerMark == 'x') {
			currentPlayerMark = 'o';
		} else {
			currentPlayerMark = 'x';
		}
	}

	// Caso vazio, adiciona a marca do jogador,
	// caso o contrario retorna uma mensagem
	public boolean placeMark(int row, int col) {
		if ((row >= 0) && (row < 3)) {
			if ((col >= 0) && (col < 3)) {
				if (board[row][col] == '-') {
					board[row][col] = currentPlayerMark;
					return true;
				}
			}
		}

		JOptionPane.showMessageDialog(null, "Escolha um campo que ainda não foi preenchido");
		this.printBoard();

		return false;
	}
}