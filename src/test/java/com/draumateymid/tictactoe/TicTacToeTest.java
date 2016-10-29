package com.draumateymid.tictactoe;

public class TicTacToeTest{

	@Test
	public void gameStatusWinnerX(){
		GameRunner runner = new GameRunner();
		GameStatus board = new GameStatus();
		DisplayGameBoard display = new DisplayGameBoard();
		String s = "Congratulations! Player X is the Winner!";
		assertArrayEquals(s, makeWinner("X"));
	}

}

class stubGameStatus implements GameStatus {

	public static boolean gameIsOver(){
		return false;
	}

	public static boolean checWinner(char[] board){
		return true;
	}

	public static boolean draw(char[] board){
		return true;
	}

}

class stubGameRunner implements GameRunner {

	public static void movePlayer(char marker){
		char[] board = {'X', 'O', 'X', 'X', 'O', 'X', 'O', 'O', 'X'};

		String s = "";
		s += " " + board[0] + " | " + board[1] + " | " + board[2] + " \n";
		s += "---+---+---\n";
		s += " " + board[3] + " | " + board[4] + " | " + board[5] + " \n";
		s += "---+---+---\n";
		s += " " + board[6] + " | " + board[7] + " | " + board[8] + " \n";
		return s;
	}

	public static char[] getBoard(){
		char[] board = {'X', 'O', 'X', 'X', 'O', 'X', 'O', 'O', 'X'};
		return board;
	}

}

class stubDisplayGameBoard implements DisplayGameBoard {

	public static void makeWinner(char player) {
		String s = "Congratulations! Player " + player + " is the Winner!"; 		
		return s; 
	}

}
