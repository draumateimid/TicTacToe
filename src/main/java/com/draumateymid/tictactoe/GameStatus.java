package com.draumateymid.tictactoe;

public class GameStatus{
	public static boolean isEmpty(char[] board, int input){
		if(board[input-1] == 'E')
				return true; 
		else
			return false; 	
	}

	public static boolean checkWinnerHorizontal(char[] board){
		for(int i = 0; i < 9; i++){
			if(board[i] == board[i+1] && board[i+1] == board[i+2])
					return true;
			else
				i = i+3;
		}
		return false; 
	}
}