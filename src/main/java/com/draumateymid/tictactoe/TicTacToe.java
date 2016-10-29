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

	//private GameRunner runner = new GameRunner();
	//private GameStatus board = new GameStatus();
	//private DisplayGameBoard display = new DisplayGameBoard(runner.getBoard());

	public static void main(String[] args){
	
		while(!GameStatus.gameIsOver(GameRunner.getBoard())){

			GameRunner.movePlayer('X');

			if(GameStatus.checkWinner(GameRunner.getBoard())){
				DisplayGameBoard.makeWinner('X');
   				break;
			}
   				
			else if(GameStatus.draw(GameRunner.getBoard())){
				DisplayGameBoard.makeDraw();
				break;
			}
				
			GameRunner.movePlayer('O');

			if(GameStatus.checkWinner(GameRunner.getBoard())){
				DisplayGameBoard.makeWinner('O');
				break;
			}
		}		
	}
}

