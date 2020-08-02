package main;

import chess.QueensEight;

public class StartProgram {
	
	public static void main(String args[]) {
	
		QueensEight queens = new QueensEight(12);
		
		long a = System.currentTimeMillis();
		queens.resetBoard(queens.getChessBoard());
		queens.doCalculation(queens.getChessBoard(), 0);
		System.out.println(System.currentTimeMillis()-a);
		System.out.println(queens.getCount());
	
	}

}
