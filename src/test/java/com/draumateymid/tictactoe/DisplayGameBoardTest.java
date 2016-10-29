package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class DisplayGameBoardTest {

	@Test
	public void emptyBoardTest(){
		String s = "";
		char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		s += "   |   |   \n";
		s += "---+---+---\n";
		s += "   |   |   \n";
		s += "---+---+---\n";
		s += "   |   |   \n";
		assertEquals(s, DisplayGameBoard.stringBuilder(b));
	}
	
	@Test
	public void fullBoardTest(){
		String s = "";
		char[] b = {'X', 'O', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		s += " X | O | X \n";
		s += "---+---+---\n";
		s += " O | O | X \n";
		s += "---+---+---\n";
		s += " X | O | X \n";
		assertEquals(s, DisplayGameBoard.stringBuilder(b));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void boardNullTest() throws Exception {
		char [] b = null;
		assertEquals("Board cannot be null", DisplayGameBoard.stringBuilder(b));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void boardWrongSizeTest() throws Exception {
		char [] b = {'X', 'O', 'X'};
		assertEquals("Board is of the wrong size", DisplayGameBoard.stringBuilder(b));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void illegalInputTest() throws Exception {
		char [] b = {'X', 'K', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals("Illegal input in board", DisplayGameBoard.stringBuilder(b));
		
	}
	
	@Test
	public void inputStringTest(){
		String s = "Player X turn, select position, 1-3 is top row, 4 - 6 is center row and 7 - 9 is bottom row";
		assertEquals(s, DisplayGameBoard.inputString('X'));
	}
	
	@Test
	public void invalidInputStringTest(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 	  			
		System.setOut(new PrintStream(outContent)); 			 
		String s = "Value entered is not valid please try again: ";
		DisplayGameBoard.invalidInputMessage(); 			
		assertEquals(s, outContent.toString()); 	
	}
	
	@Test
	public void fullFieldMessageTest(){
		String s = "Field is not empty, please try again: ";
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 	  			
		System.setOut(new PrintStream(outContent)); 			 
		DisplayGameBoard.fullFieldMessage(); 			
		assertEquals(s, outContent.toString());
	}
	
	@Test 	
	public void makeWinnerXTest(){ 				
		String s = "Congratulations! Player X is the Winner!"; 		
		assertEquals(s, DisplayGameBoard.makeWinnerString('X')); 	
		} 	
	
	@Test 	
	public void makeWinnerOTest(){ 		 		
		String s = "Congratulations! Player O is the Winner!"; 		
		assertEquals(s, DisplayGameBoard.makeWinnerString('O')); 	
		}
		
	@Test(expected=IllegalArgumentException.class) 	
	public void makeWinnerWrongInputTest() throws Exception { 				
		String s = "Player has to be either 'X' or 'O'!"; 		
		assertEquals(s, DisplayGameBoard.makeWinnerString('A')); 	
		}
	
	@Test 	
	public void TestHello(){ 		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 	  			
		System.setOut(new PrintStream(outContent)); 			 
		String s = "Value entered is not valid please try again: ";
		DisplayGameBoard.invalidInputMessage(); 			
		assertEquals(s, outContent.toString()); 	
		}
}
