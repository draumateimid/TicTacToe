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

	private static GameRunner runner = new GameRunner();
	//private GameStatus board = new GameStatus();
	//private DisplayGameBoard display = new DisplayGameBoard(runner.getBoard());

	public static void main(String[] args) {
	
		while(!GameStatus.gameIsOver(runner.getBoard())) {

			runner.movePlayer('X');

			if(GameStatus.checkWinner(runner.getBoard())) {
				DisplayGameBoard.makeWinner('X');
   				break;
			}
   				
			if(GameStatus.draw(runner.getBoard())) {
				DisplayGameBoard.makeDraw();
				break;
			}
				
			runner.movePlayer('O');

			if(GameStatus.checkWinner(runner.getBoard())) {
				DisplayGameBoard.makeWinner('O');
				break;
			}
		}		
	}
}

