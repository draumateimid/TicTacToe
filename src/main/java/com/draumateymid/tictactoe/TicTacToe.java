package com.draumateymid.tictactoe;

public class TicTacToe {
	Private GameRunner runner = new GameRunner();
	Private GameStatus board = new GameStatus();

	public static void main(){
	
		while(!GameStatus.gameIsOver()){

			runner.movePlayer(“X”);

			if(GameStatus.checkWinner(runner.getBoard())
			{
				runner.makeWinner(“X”);
   				break;
			}
   				
			else if(GameStatus.Draw()){
				println(It’s a draw!)
				break;
			}
				
			runner.movePlayer(“O”);

			if(GameStatus.checkWinnermove.getBoard())
			{
				runner.makeWinner(“O”);
				break;
			}
				

	}

}

