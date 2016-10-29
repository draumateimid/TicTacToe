package com.draumateymid.tictactoe;

public class TicTacToe {
	private static GameRunner runner = new GameRunner();
	private static DisplayGameBoard board;// = new DisplayGameBoard();
	//private GameStatus board = new GameStatus();

	public static void main(){
		int r = 0;
		runner.movePlayer('X');
		
		board.displayTicTac(runner.getBoard());
		System.out.print("End");	 

	}

}

