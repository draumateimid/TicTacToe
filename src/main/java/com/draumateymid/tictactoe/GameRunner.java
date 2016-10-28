package com.draumateymid.tictactoe;

import java.io.IOException;

/**
*##Game runner class
*
*This class handles the game actions,
*the actual game history is stored here as 
*character array of size 9.
*@author Draumateymid
*Date created 28.10.2016
*
*/
public class GameRunner{

	private static char[] board = new char[9];
	
	GameRunner(){
		for (int i = 0; i < 9; i++)
			board[i] = ' ';
	}

	/**
	*This method sets a players 
	*move into the board
	*
	*@param input 
	*@param marker
	*/
	private static void fillField(int input, char marker){
		checkInput(input, marker);
		board[input-1] = marker;
	}
	
	/**
	*The method returns true if board field
	*has not been taken by either player
	*Throws exception if input is not valid.
	*@param input
	*/
	private static boolean isEmpty(int input){
		if(checkInput(input)){
			return board[input] == ' ';
		}
		return false;
	}

	/**
	*This method checks if input is valid, i.e between 0-9.
	*Throws exception otherwise.
	*@param input
	*/
	private static boolean checkInput(int input){
		if (input < 0 || input > 8)
			return false;
		return true;
	}

	/**
        *This method checks if input is valid, i.e between 0-9.
        *Throws exception otherwise.
        *@param input
	*@param marker
        */
        private static void checkInput(int input, char marker) throws IllegalArgumentException{
                if (input < 0 || input > 8 || marker != 'X' || marker != 'O'){
                        throw new IllegalArgumentException("Input is not valid!");
		}
        
	}

	
/*
	private boolean isEmpty(int input)
	private int getInput
	private boolean checkInput(int input)
		Integer is valid (1-9)
		isEmpty(int input)
		Return true
		Return false
*/	
	/**
	*##This method returns current game
	*board
	*
	*/
	public static char[] getBoard(){
		return board;
	}	

	public static void movePlayer(char marker){
		int input = Integer.MAX_VALUE;
	
		do{    
			if (input == Integer.MAX_VALUE){
			     System.out.print("Player " + marker + 
				" turn,  select position, 1-3 is top row, 4 - 6 is center row and 7 - 9 is bottom row");
			}
			else{
				System.out.print("Value entered is not valid please try again: ");
			}
			
			input = Integer.parseInt(System.console().readLine());
		}while (checkInput(input));
/*
		fillField(int input, char marker)
		displayBoard(char[] board)
*/
	}
}

