package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import chess.QueensEight;

public class Utest {

	// private QueensEight queens;

	// @Test
	public void test() {
		fail("Not yet implemented");
	}

	@After
	public void teatDown() {
		// this.queens = null;
	}

	@Test
	public void testFourQueens() {
		int n = 4;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 2);
	}

	@Test
	public void testFiveQueens() {
		int n = 5;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 10);
	}

	@Test
	public void testSixQueens() {
		int n = 6;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 4);
	}

	@Test
	public void testSevenQueens() {
		int n = 7;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 40);
	}

	@Test
	public void testEightQueens() {
		int n = 8;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 92);
	}

	@Test
	public void testNineQueens() {
		int n = 9;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 352);
	}

	@Test
	public void testTenQueens() {
		int n = 10;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 724);
	}

	@Test
	public void testElevenQueens() {
		int n = 11;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 2680);
	}

	@Test
	public void testTwelveQueens() {
		int n = 12;
		// create new object and set the number of queens
		QueensEight queens = new QueensEight(n);
		// fills the board with '-'
		queens.resetBoard(queens.getChessBoard());
		// calculates solutions
		queens.doCalculation(queens.getChessBoard(), 0);
		// prints out possible solutions
		System.out.println("test " + n + " result: " + queens.getCount());
		// checks if the result is as expected.
		assertTrue(queens.getCount() == 14200);
	}

}
