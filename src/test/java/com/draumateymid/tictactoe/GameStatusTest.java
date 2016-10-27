package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class GameStatusTest{
	
	@Test
	public void testIsEmpty(){
		char[] board = {'E', 'X', 'O', 'E', 'E', 'O', 'E', 'X', 'X'};
		assertEquals(true, GameStatus.isEmpty(board, 4)); 
	}
}