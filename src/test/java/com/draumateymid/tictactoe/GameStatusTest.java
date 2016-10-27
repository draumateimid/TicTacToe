package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class GameStatusTest{
	
	@Test
	public void testIsEmpty(){
		char[] board = {'E', 'X', 'O', 'E', 'E', 'O', 'E', 'X', 'X'};
		assertEquals(true, GameStatus.isEmpty(board, 4)); 
	}

	@Test
	public void testIfWinnerHorizontal(){
		char[] board = {'X', 'X', 'X', 'E', 'O', 'O', 'E', 'E', 'E'};
		assertEquals(true, GameStatus.checkWinnerHorizontal(board)); 
	}

	@Test
	public void testIfWinnerVertical(){
		char[] board = {'E', 'O', 'X', 'E', 'O', 'X', 'E', 'E', 'X'};
		assertEquals(true, GameStatus.checkWinnerVertical(board)); 
	}
}