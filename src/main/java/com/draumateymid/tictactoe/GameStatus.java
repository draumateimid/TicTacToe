package com.draumateymid.tictactoe;

public class GameStatus{
	public static boolean isEmpty(char[] board, int input){
		if(board[input-1] == 'E')
				return true; 
		else
			return false; 	
	}
}