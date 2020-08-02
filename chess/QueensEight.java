package chess;

public class QueensEight {

	private int queens;
	private int count = 0;
	private char[][] chessBoard;

	public QueensEight(int queens) {
		this.queens = queens;
		this.chessBoard = new char[queens][queens];
	}

	// return the chessBoard.
	public char[][] getChessBoard() {
		return chessBoard;
	}

	// method used for checking if the position is legals for safely placing a
	// queen.
	public boolean isLegal(char board[][], int row, int col) {

		// Checks if the column is safe from other queens.
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// Checks if the queen is \ diagonal safe.
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		// Checks if the queen is / diagonal safe.
		for (int i = row, j = col; i >= 0 && j < queens; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		return true;

	}

	public void doCalculation(char board[][], int r) {
		if (r == queens) {
			// Code for printing solution as a chessboard to the console.
			/*
			 * for (int i = 0; i < queens; i++) { for (int j = 0; j < queens; j++) {
			 * System.out.print(board[i][j] + " "); } System.out.println();
			 * 
			 * } System.out.println();
			 */

			// increases for each solution.
			count++;
			return;
		}
		// proceeds to the next column.
		for (int i = 0; i < queens; i++) {

			// check if the position is legal.
			if (isLegal(board, r, i)) {

				// places queen at the position
				board[r][i] = 'Q';

				// recurse to the next row.
				doCalculation(board, r + 1);

				// backtrack and removes the queen from the current sqaure.
				board[r][i] = '-';

			}
		}

	}

	// returns the amount of solutions.
	public int getCount() {
		// makes a print out if there is on solutions.
		if (count == 0) {
			System.out.println("No Solutions!!");
		}
		return count;
	}

	// method for filling the board with blank spaces before run.
	public void resetBoard(char board[][]) {
		int row = 0, col = 0;
		while (!(col >= queens)) {
			row = 0;
			while (!(row >= queens)) {
				board[row][col] = '-';
				row++;
			}
			col++;
		}
	}
}
