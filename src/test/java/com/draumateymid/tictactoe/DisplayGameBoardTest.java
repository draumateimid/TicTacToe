package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals;

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
}
