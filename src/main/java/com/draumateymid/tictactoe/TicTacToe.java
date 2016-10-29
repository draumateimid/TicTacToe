package com.draumateymid.tictactoe;

public class TicTacToe {
	private static GameRunner runner = new GameRunner();
	private static DisplayGameBoard board;// = new DisplayGameBoard();
	//private GameStatus board = new GameStatus();

	public static void main(String args[]){
		int r = 0;
	
		runner.movePlayer('X');
		runner.movePlayer('O');
		runner.movePlayer('X');
		runner.movePlayer('O');
		
		//board.displayTicTac(runner.getBoard());
		System.out.print("End");	 

	}
}

