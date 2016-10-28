package com.draumateymid.tictactoe;


public class GameRunner{

	Private Char[] board = new Char[9];
	
	GameRunner(){
		for (int i = 0; i < 9; i++)
			board[i] = ' ';
	}

	Private void fillField(int input, string marker){
		board[input-1] = marker;
	}
/*
	Private boolean isEmpty(int input)
	Private int getInput
	Private boolean checkInput(int input)
		Integer is valid (1-9)
		isEmpty(int input)
		Return true
		Return false
*/	
	Public Char[] getBoard(){
		return board;
	}	
/*	
	Public void movePlayer(string marker)
		do
		Int input = getInput();
		While (checkInput(int input))
		fillField(int input, string marker)
		displayBoard(Char[] board)
*/
}

