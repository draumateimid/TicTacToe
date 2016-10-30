/*
package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class GameControllerTest{
	
	private GameController controller = new GameController();
	
	@Test
	public void makeMoveXWinsTest(){
		stubGameStatus status = new stubGameStatus();
		stubGameRunner runner = new stubGameRunner();
		
		assertEquals("winnerX", controller.checkWinner(runner.getBoard()));
	}
}

class stubGameStatus extends GameStatus {

	public stubGameStatus(){
		
	}
	
	public static boolean gameIsOver(){
		return false;
	}

	public static boolean checWinner(char[] board){
		return true;
	}

	public static boolean draw(char[] board){
		return true;
	}
	
	private static boolean checkWinnerHorizontal(char[] board) {
		return true;
	}
	
	private static boolean checkWinnerVertical(char[] board) {
		return true;
	}
		
	private static boolean checkWinnerDiagonal(char[] board) {
		return true;
	}
	
}

class stubGameRunner implements GameRunner {
	

	public static char[] getBoard(){
		char[] board = {'X', 'O', 'X', 'X', 'O', 'X', 'O', 'O', 'X'};
		return board;
	}

}
*/