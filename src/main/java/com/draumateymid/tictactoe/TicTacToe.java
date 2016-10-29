package com.draumateymid.tictactoe;

/**
*##TicTacToe class
*
*This class handles the main method of the game
*@author Draumateymid
*Date created 23.10.2016
*
*/

public class TicTacToe {
	private GameRunner runner = new GameRunner();
	private GameStatus board = new GameStatus();
	private DisplayGameBoard display = new DisplayGameBoard();

	public static void main(){
	
		while(!board.gameIsOver()){

			runner.movePlayer("X");

			if(board.checkWinner(runner.getBoard()))
			{
				display.makeWinner("X");
   				break;
			}
   				
			else if(board.draw()){
				display.makeDraw();
				break;
			}
				
			runner.movePlayer("O");

			if(board.checkWinner(runner.getBoard()))
			{
				display.makeWinner("O");
				break;
			}
		}		
	}

}

