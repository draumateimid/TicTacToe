package com.draumateymid.tictactoe;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

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
	
	/**
	*GameRunner constructor, initializes the game board
	*with all empty fields
	*/
	public GameRunner(){
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
		board[input - 1] = marker;
	}
	
	/**
	*The method returns true if board field
	*has not been taken by either player
	*Throws exception if input is not valid.
	*
	*@param input
	*/
	public static boolean isEmpty(int input){
		if(checkInput(input)){
			return board[input - 1] == ' ';
		}
		return false;
	}

	/**
	*This method checks if input is valid, i.e between 0-9.
	*Throws exception otherwise.
	*
	*@param input
	*/
	private static boolean checkInput(int input){
		if (input < 1 || input > 9)
			return false;
		return true;
	}
	
	/**
	*This method checks if input is valid, i.e between 0-9.
	*Throws exception otherwise.
	*
	*@param input
	*@param marker
    */
    private static void checkInput(char marker) throws IllegalArgumentException{
		if (marker == 'X' || marker == 'O'){
			return;
		}
		else{ 
			throw new IllegalArgumentException("Marker has to be either 'X' or 'O'!");
		}
	}
	

	/**
	*This method checks if input is valid, i.e between 0-9.
	*Throws exception otherwise.
	*
	*@param input
	*@param marker
    */
    private static void checkInput(int input, char marker) throws IllegalArgumentException{
		if (marker == 'X' || marker == 'O'){
			if (input < 1 || input > 9){
						throw new IllegalArgumentException("Input is not an intege between 1-9!");
			}
		}
		else{ 
			throw new IllegalArgumentException("Marker has to be either 'X' or 'O'!");
		}
	}
	
	/**
	*This method returns current game
	*board
	*
	*/
	public static char[] getBoard(){
		return board;
	}	
	
	/**
	*This method handles the players moves
	*
	*@param marker
	*/
	public static void movePlayer(char marker, int input){
		checkInput(input, marker);
		//if (!isEmpty(input)){
		//	DisplayGameBoard.fullFieldMessage();
			//Get input 
			//Þetta var while lykkja 
		//}
		fillField(input, marker);
	}

	public static char switchUser(char marker) {
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
}

