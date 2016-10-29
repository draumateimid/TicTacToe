package com.draumateymid.tictactoe;

/**
 * ##Game status class
 * 
 * @author Draumateymið
 * Date created: 28.10.2016
 * 
 * Checks the status of the game TicTacToe.
 *
 */

public class GameStatus { 
	
	/**
	 * Empty constructor
	 */
	public GameStatus() {
		
	}
	
	/**
	 * Function to check horizontal win.
	 * @param char[] board
	 */
	public static boolean draw(char[] board) {
		int count = 0; 
		for(int i = 0; i < 9; i++) {
			if(board[i] == 'X') {
				count++; 
			}
		}
		if(count == 5) {
			return true; 
		}
		return false; 
	}

	/**
	 * Function to check if came is over.
	 * @param char[] board
	 */
	public static boolean gameIsOver(char[] board){
		if(checkWinner(board) || draw(board)) {
			return true;
		}
		return false; 
	}

	/**
	 * Function to check if there is a winner.
	 * @param char[] board
	 */
	public static boolean checkWinner(char[] board) {
		if(checkWinnerVertical(board) || checkWinnerDiagonal(board) || checkWinnerHorizontal(board)) {
			return true;
		}
		return false; 
	}

	/**
	 * Helper function to check horizontal win.
	 * @param char[] board
	 */
	private static boolean checkWinnerHorizontal(char[] board) {
		for(int i = 0; i < 9; i += 3) {
			if(board[i]   == board[i+1] && board[i+1] == board[i+2] && board[i]   != ' ') {
				return true;
			}
		}
		return false; 
	}

	/**
	 * Helper function to check Verical win.
	 * @param char[] board
	 */
	private static boolean checkWinnerVertical(char[] board) {
		for(int i = 0; i < 3; i++){
			if(board[i] == board[i+3] && board[i+3] == board[i+6] && board[i] != ' ') {
				return true; 
			}
		}
		return false; 
	}

	/**
	 * Helper function to check Diagonal win.
	 * @param char[] board
	 */
	private static boolean checkWinnerDiagonal(char[] board) {
		if(board[0] == board[4] && board[4] == board[8] && board[0] != ' ') {
			return true; 
		}
		if(board[2] == board[4] && board[4] == board[6] && board[2] != ' ') {
			return true; 
		}
		return false; 
	}
}