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
		board[input - 1] = marker;
	}
	
	/**
	*The method returns true if board field
	*has not been taken by either player
	*Throws exception if input is not valid.
	*@param input
	*/
	private static boolean isEmpty(int input){
		if(checkInput(input)){
			return board[input - 1] == ' ';
		}
		return false;
	}

	/**
	*This method checks if input is valid, i.e between 0-9.
	*Throws exception otherwise.
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
		int input = -1;
		InputStream userInput = System.in;
		
		System.out.print("Player " + marker + " turn,  select position, 1-3 is top row, 4 - 6 is center row and 7 - 9 is bottom row");
		input = getUserInput(userInput);
		
		//System.out.println("Before read");
		//String s = System.console().readLine();
		//System.out.println("after read");
		//System.out.println(s);
		//input = Integer.parseInt(System.console().readLine());
		fillField(input, marker);
/*
		displayBoard(char[] board)
*/
	}
	
	private static int getUserInput(InputStream in){
		Scanner userInput = new Scanner(in);
		int input = userInput.nextInt();
		System.out.println("input" + input);
		while (input < 1  || input > 9){
			System.out.print("Value entered is not valid please try again: ");
			input = userInput.nextInt();
		}		
		return input;
	}
	
}

