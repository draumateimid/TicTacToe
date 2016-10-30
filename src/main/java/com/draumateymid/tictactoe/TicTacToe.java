package com.draumateymid.tictactoe;

import java.io.InputStream; 
import java.util.Scanner; 

/**
*##TicTacToe class
*
*This class handles the main method of the game
*@author Draumateymid
*Date created 23.10.2016
*
*/

public class TicTacToe {

	public static void main(String[] args) {
		GameRunner runner = new GameRunner();
		Scanner userInput = new Scanner(System.in); 
		char marker = ' '; 
		while(!GameStatus.gameIsOver(runner.getBoard())) { 
			marker = switchUser(marker); 
			DisplayGameBoard.inputMessage(marker);
			runner.movePlayer(marker, getUserInput(userInput));

			if(GameStatus.checkWinner(runner.getBoard())) {
				DisplayGameBoard.makeWinner(marker);
   				break;
			}
   				
			if(GameStatus.draw(runner.getBoard())) {
				DisplayGameBoard.makeDraw();
				break;
			}

		}
		userInput.close(); 		
	}

	private static char switchUser(char marker) {
		if(marker == ' ') {
			return 'X';
		}
		else if(marker == 'X') {
			return 'O'; 
		}
		else {
			return 'X';
		}
	}

	private static int getUserInput(Scanner userInput){
		int input = userInput.nextInt(); 
		while (input < 1  || input > 9){
			DisplayGameBoard.invalidInputMessage();
			input = userInput.nextInt(); 
		}
		return input;
	}
}

